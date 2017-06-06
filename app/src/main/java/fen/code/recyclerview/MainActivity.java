package fen.code.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import fen.code.recyclerview.adapter.RecyclerViewAdapter;
import fen.code.recyclerview.entity.ViewItem;

public class MainActivity extends AppCompatActivity {

    List<ViewItem> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* initiate list using ArrayList */
        list = new ArrayList<>();
        list.add(new ViewItem(R.drawable.m01, getString(R.string.m01_desb)));
        list.add(new ViewItem(R.drawable.m02, getString(R.string.m02_desb)));
        list.add(new ViewItem(R.drawable.m03, getString(R.string.m03_desb)));
        list.add(new ViewItem(R.drawable.m04, getString(R.string.m04_desb)));
        list.add(new ViewItem(R.drawable.m05, getString(R.string.m05_desb)));
        list.add(new ViewItem(R.drawable.m06, getString(R.string.m06_desb)));
        list.add(new ViewItem(R.drawable.m07, getString(R.string.m07_desb)));
        list.add(new ViewItem(R.drawable.m08, getString(R.string.m08_desb)));
        list.add(new ViewItem(R.drawable.m09, getString(R.string.m09_desb)));
        list.add(new ViewItem(R.drawable.m10, getString(R.string.m10_desb)));
        list.add(new ViewItem(R.drawable.m11, getString(R.string.m11_desb)));
        list.add(new ViewItem(R.drawable.m12, getString(R.string.m12_desb)));
        list.add(new ViewItem(R.drawable.m13, getString(R.string.m13_desb)));
        list.add(new ViewItem(R.drawable.m14, getString(R.string.m14_desb)));

        /* initiate RecyclerView */
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        /* initiate RecyclerViewAdapter */
        RecyclerViewAdapter tutorialAdapter = new RecyclerViewAdapter(getApplicationContext(), list);

        /* initiate LayoutManager */
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        /* setup RecyclerView */
        recyclerView.setHorizontalScrollBarEnabled(false);
        recyclerView.setVerticalScrollBarEnabled(false);
        recyclerView.setLayoutManager(layoutManager);

        /* setAdapter RecyclerView */
        recyclerView.setAdapter(tutorialAdapter);
    }
}
