package com.test.acttofrag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity{
    ListView lv;
    Class[] classes = new Class[]{
            NormalActivity.class,
            NormalActivityToFrag.class,
            FastActivity.class,
            FastActivityToFrag.class
    };

    String[] strings = new String[]{
            "Activity正常显示",
            "Fragment正常显示",
            "Activity逻辑分离",
            "Fragment逻辑分离"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,strings);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(MainActivity.this,classes[position]));
            }
        });
    }
}
