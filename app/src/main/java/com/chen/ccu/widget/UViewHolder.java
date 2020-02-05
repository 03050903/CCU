package com.chen.ccu.widget;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * 一个通用的ViewHolder
 */
public class UViewHolder extends RecyclerView.ViewHolder {
    public UViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void bind(List<? extends UListItem> list,int position){

    }
}
