package com.chen.ccu.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/**
 * 一个通用的列表展示工具类
 */
public class UListView extends RecyclerView {
    public UListView(@NonNull Context context) {
        super(context);
    }

    public UListView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public UListView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
