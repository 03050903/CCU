package com.chen.ccu.widget;

import com.chen.ccu.R;

/**
 * 默认的ViewHolder,返回的ItemviewType为-1<br/>
 * 其他的ViewHolderCreator创建ViewHolder失败极大的可能是因为反射的问题，为此，该类最好重写create方法，<br/>
 * 来native的方式创建Viewholder，保证创建成功
 *
 */
public class UViewDefaultHolderCreator extends UViewHolderCreator<UViewHolder>{
    @Override
    public final int getItemViewType() {
        return -1;
    }

    @Override
    public int getItemViewLayoutId() {
        return R.layout.item_default;
    }

    @Override
    public Class<? extends UViewHolder> getHolderClass() {
        return UViewHolder.class;
    }
}
