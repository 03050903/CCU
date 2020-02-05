package com.chen.ccu.widget;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Constructor;

/**
 * viewHolder的创建工具
 */
public class UViewHolderCreator<T extends UViewHolder> implements IUViewHolderCreator<T> {
    private static final String TAG=UViewHolderCreator.class.getSimpleName();
    private Class<T> mHolderClass;
    private int itemViewLayoutId;
    private int itemViewType;
    private Constructor mHolderConstructor;

    @Override
    public Class<? extends T> getHolderClass() {
        return mHolderClass;
    }

    @Override
    public int getItemViewLayoutId() {
        return itemViewLayoutId;
    }

    @Override
    public int getItemViewType() {
        return itemViewType;
    }
    public UViewHolderCreator(int itemViewLayoutId,int itemViewType,Class<T> holderClass){
        this.itemViewLayoutId=itemViewLayoutId;
        this.itemViewType=itemViewType;
        this.mHolderClass=holderClass;
    }

    public UViewHolderCreator(){

    }

    static int i=0;
    @Override
    public T create(ViewGroup parent,LayoutInflater inflater){
        Log.i("ccl","count:"+i++);
        if (mHolderConstructor==null){
            try{
                mHolderConstructor = getHolderClass().getConstructor(View.class);
                View view= inflater.inflate(getItemViewLayoutId(),parent,false);
                return (T) mHolderConstructor.newInstance(view);
            }catch (Exception e){
                Log.i(TAG,"create error:"+e.getMessage()+","+e.getClass());
            }
        }
        if (mHolderConstructor==null){
            return null;
        }
        try{
            View view= inflater.inflate(getItemViewLayoutId(),parent,false);
            return (T) mHolderConstructor.newInstance(view);
        }catch (Exception e){
            Log.i(TAG,"constructor create error:"+e.getMessage()+","+e.getClass());
        }
        return null;
    }
}
