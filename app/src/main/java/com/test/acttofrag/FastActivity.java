package com.test.acttofrag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 13798 on 2016/7/29.
 */
public class FastActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyViewGroup mg =new MyViewGroup(this);
        setContentView(mg);
    }
}
