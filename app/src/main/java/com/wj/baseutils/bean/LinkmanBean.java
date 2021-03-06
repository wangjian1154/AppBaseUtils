package com.wj.baseutils.bean;

import java.io.Serializable;

/**
 * Created by wj on 2018/3/6.
 */

public class LinkmanBean implements Serializable {

    public static final int TYPE_TITLE = 0;
    public static final int TYPE_NORMAL = 1;
    public String name;
    public String mobile;
    private int itemType;
    private String pinyin;
    private String firstLetter;

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }
}
