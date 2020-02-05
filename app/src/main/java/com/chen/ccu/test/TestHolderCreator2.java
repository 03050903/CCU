package com.chen.ccu.test;

import com.chen.ccu.R;
import com.chen.ccu.widget.UViewHolder;
import com.chen.ccu.widget.UViewHolderCreator;

public class TestHolderCreator2 extends UViewHolderCreator<UViewHolder> {
    @Override
    public int getItemViewType() {
        return 2;
    }

    @Override
    public int getItemViewLayoutId() {
        return R.layout.test_item;
    }

    @Override
    public Class<? extends UViewHolder> getHolderClass() {
        return TestHolder2.class;
    }
}
