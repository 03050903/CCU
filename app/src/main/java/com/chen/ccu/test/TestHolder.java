package com.chen.ccu.test;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.chen.ccu.R;
import com.chen.ccu.widget.UListItem;
import com.chen.ccu.widget.UViewHolder;

import java.util.List;

public class TestHolder extends UViewHolder {
    private TextView textView;
    public TestHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.tv);
    }

    @Override
    public void bind(List<? extends UListItem> list, int position) {
        textView.setText("item："+position);
    }
}
