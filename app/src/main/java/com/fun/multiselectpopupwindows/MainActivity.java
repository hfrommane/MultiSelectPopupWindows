package com.fun.multiselectpopupwindows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

import com.fun.multiselectpopupwindows.model.Search;
import com.fun.multiselectpopupwindows.widget.MultiSelectPopupWindows;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.category;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout linearLayoutProductType;
    private List<Search> products;
    private MultiSelectPopupWindows productsMultiSelectPopupWindows;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayoutProductType = (LinearLayout) findViewById(R.id.linearLayout_product_type);
        linearLayoutProductType.setOnClickListener(this);
        getData();
    }

    @Override
    public void onClick(View v) {
        productsMultiSelectPopupWindows = new MultiSelectPopupWindows(this, linearLayoutProductType, 110, products);
        productsMultiSelectPopupWindows.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                Toast.makeText(MainActivity.this, "我消失了，你可以做点什么。", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getData() {
        products = new ArrayList<>();
        products.add(new Search("日用百货", false, "0"));
        products.add(new Search("电子电器", false, "1"));
        products.add(new Search("服装鞋子", false, "2"));
        products.add(new Search("生鲜水果", false, "3"));
        products.add(new Search("食品零售", false, "4"));
        products.add(new Search("手工艺品", false, "5"));
        products.add(new Search("珠宝玉石", false, "6"));
    }

}
