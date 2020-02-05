package com.chen.ccu.widget;

import android.view.LayoutInflater;
import android.view.ViewGroup;

public interface IUViewHolderCreator<T extends UViewHolder> {
    /**
     * 获取itemviewtype
     * @return
     */
    int getItemViewType();

    /**
     * 获取itemview的layoutid
     * @return
     */
    int getItemViewLayoutId();

    /**
     * 获取item对应的holder的class
     * @return
     */
    Class<? extends T> getHolderClass();
    /**
     * 创建ViewHolder，如果返回null表示创建失败，需要使用兜底的ViewHolder来展示
     * @param parent        ViewParent
     * @param inflater      LayoutInflater
     * @return
     */
    T create(ViewGroup parent, LayoutInflater inflater);
}
