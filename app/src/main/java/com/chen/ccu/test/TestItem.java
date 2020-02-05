package com.chen.ccu.test;

import androidx.appcompat.view.menu.MenuView;

import com.chen.ccu.widget.UDefaultItem;
import com.chen.ccu.widget.UListItem;

public class TestItem implements UListItem {
    private int itemViewType;
    public TestItem(int itemViewType){
        this.itemViewType=itemViewType;
    }
    @Override
    public int getViewType() {
        return itemViewType;
    }
}
