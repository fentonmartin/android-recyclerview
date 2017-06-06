package fen.code.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import fen.code.recyclerview.entity.ViewItem;

public class MainActivity extends AppCompatActivity {

    List<ViewItem> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Initiate list using ArrayList */
        list = new ArrayList<>();
        list.add(new ViewItem(R.drawable.m01, getString(R.string.m01_desb)));
        list.add(new ViewItem(R.drawable.m02, getString(R.string.m02_desb)));
        list.add(new ViewItem(R.drawable.m03, getString(R.string.m03_desb)));
        list.add(new ViewItem(R.drawable.m04, getString(R.string.m04_desb)));
        list.add(new ViewItem(R.drawable.m05, getString(R.string.m05_desb)));

    }
}
