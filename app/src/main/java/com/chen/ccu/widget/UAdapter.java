package com.chen.ccu.widget;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chen.ccu.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个通用的adapter
 * @param <T>
 */
public abstract class UAdapter<T extends UListItem> extends RecyclerView.Adapter<UViewHolder> {

    private List<T> mUList;
    /**
     * holder的管理器，负责holder的分类和创建
     */
    protected UViewHolderManager mHolderManager;
    public UAdapter(){
        this(null);
    }
    public UAdapter(List<T> list){
        if (list==null){
            mUList=new ArrayList<>();
        }else{
            mUList=list;
        }
        mHolderManager=new UViewHolderManager();
        mHolderManager.registerDefaultViewHolder(new UViewDefaultHolderCreator());
        initViewHolders();
    }

    /**
     * 初始化Viewholder
     */
    protected abstract void initViewHolders();


    /**
     * 设置数据
     * @param list
     */
    public void setListData(List<T> list){
        this.mUList.clear();
        if (list!=null){
            mUList.addAll(list);
        }
    }
    @NonNull
    @Override
    public UViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        UViewHolder viewHolder = mHolderManager.create(viewType, parent);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UViewHolder holder, int position) {
        T item = mUList.get(position);
        holder.bind(mUList,position);
    }

    @Override
    public int getItemCount() {
        return CollectionUtils.isEmpty(mUList) ?0:mUList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mUList.get(position).getViewType();
    }
}
