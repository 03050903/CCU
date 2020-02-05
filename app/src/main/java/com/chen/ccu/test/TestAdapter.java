package com.chen.ccu.test;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chen.ccu.widget.UAdapter;
import com.chen.ccu.widget.UViewHolder;

public class TestAdapter extends UAdapter<TestItem> {

    @Override
    protected void initViewHolders() {
        TestHolderCreator creator=new TestHolderCreator();
        TestHolderCreator2 creator2=new TestHolderCreator2();

        mHolderManager.registerViewHolder(creator);
        mHolderManager.registerViewHolder(creator2);
    }
}
