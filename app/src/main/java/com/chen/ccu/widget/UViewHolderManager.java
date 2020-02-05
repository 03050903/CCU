package com.chen.ccu.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class UViewHolderManager {
    private SparseArray<IUViewHolderCreator> mHolderCache;
    private LayoutInflater mLayoutInflater;
    private NotSupportCallback mCallback;
    public UViewHolderManager(){
        mHolderCache=new SparseArray<>();
        registerDefaultViewHolder(new UViewDefaultHolderCreator());
    }

    /**
     * 设置当viewtype不支持的时候的回调事件
     * @param callback
     */
    public void setNotSupportCallback(NotSupportCallback callback){
        this.mCallback=callback;
    }

    /**
     * 注册一个holder创建器
     * @param itemViewLayoutId
     * @param itemViewType
     * @param holderClass
     */
    public void registerViewHolder(int itemViewLayoutId,int itemViewType,Class<? extends UViewHolder> holderClass){

        registerViewHolder(new UViewHolderCreator(itemViewLayoutId,itemViewType,holderClass));
    }

    /**
     * 注册默认的holder创建器
     * @param creator
     */
    public void registerDefaultViewHolder(UViewDefaultHolderCreator creator){
        registerViewHolder(creator);
    }

    /**
     * 注册一个holder创建器
     * @param creator
     * @param <T>
     */
    public <T extends IUViewHolderCreator> void registerViewHolder(T creator){
        mHolderCache.put(creator.getItemViewType(),creator);
    }

    /**
     * 创建ViewHolder
     * @param itemViewType
     * @param parent
     * @return
     */
    public UViewHolder create(int itemViewType, ViewGroup parent){
        if (mLayoutInflater==null){
            mLayoutInflater=LayoutInflater.from(parent.getContext());
        }
        IUViewHolderCreator creator = mHolderCache.get(itemViewType);
        Log.i("chen","creator is:"+creator);
        if (creator!=null){
            UViewHolder viewHolder = creator.create(parent, mLayoutInflater);
            return viewHolder;
        }else{
            return createDefaultHolder(parent,itemViewType);
        }
    }

    /**
     * 当viewType不支持的时候创建默认的Viewholder。setNotSupportCallback可以定制自己的创建方式或者通过registerDefaultViewHolder方法来注册创建器
     * @param parent
     * @param viewType
     * @return
     */
    private UViewHolder createDefaultHolder(ViewGroup parent,int viewType){
        if (mCallback!=null){
            return mCallback.create(parent, mLayoutInflater,viewType);
        }else{
            IUViewHolderCreator defaultViewHolderCreator = mHolderCache.get(-1);
            if (defaultViewHolderCreator==null){
                throw new NullPointerException("default holder creator is not set.use registerDefaultViewHolder method register a default creator.");
            }
            return defaultViewHolderCreator.create(parent,mLayoutInflater);
        }
    }

    /**
     * 当ViewType不支持的时候的回调
     */
    public interface NotSupportCallback{
        /**
         * 创建不支持的ViewHolder
         * @param parent        ViewGroup
         * @param inflater      LayoutInflater
         * @param viewType      ViewType
         * @return
         */
        UViewHolder create(ViewGroup parent,LayoutInflater inflater,int viewType);
    }
}
