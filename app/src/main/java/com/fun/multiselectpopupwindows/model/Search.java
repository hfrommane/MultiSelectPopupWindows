package com.fun.multiselectpopupwindows.model;

/**
 * Created by HZF on 2017/5/16.
 */

public class Search {

    private String keyWord;
    private boolean isChecked;
    private String no;

    public Search(String keyWord, boolean isChecked) {
        this.keyWord = keyWord;
        this.isChecked = isChecked;
    }

    public Search(String keyWord, boolean isChecked, String no) {
        this.keyWord = keyWord;
        this.isChecked = isChecked;
        this.no = no;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
