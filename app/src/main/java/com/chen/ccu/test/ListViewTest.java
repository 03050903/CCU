package com.chen.ccu.test;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.chen.ccu.R;
import com.chen.ccu.widget.UListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewTest extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity_list);
        UListView listView=findViewById(R.id.listview);
        listView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        TestAdapter adapter=new TestAdapter();
        List<TestItem> items=new ArrayList<>();
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(3));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(3));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(3));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(3));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        items.add(new TestItem(2));
        items.add(new TestItem(1));
        adapter.setListData(items);
        listView.setAdapter(adapter);
    }
}
