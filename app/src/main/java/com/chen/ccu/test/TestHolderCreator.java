package com.chen.ccu.test;

import com.chen.ccu.R;
import com.chen.ccu.widget.UViewHolder;
import com.chen.ccu.widget.UViewHolderCreator;

public class TestHolderCreator extends UViewHolderCreator<UViewHolder> {
    @Override
    public int getItemViewType() {
        return 1;
    }

    @Override
    public int getItemViewLayoutId() {
        return R.layout.test_item;
    }

    @Override
    public Class<? extends UViewHolder> getHolderClass() {
        return TestHolder.class;
    }
}
