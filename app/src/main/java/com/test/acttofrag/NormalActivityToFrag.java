package com.test.acttofrag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 13798 on 2016/7/29.
 */
public class NormalActivityToFrag extends AppCompatActivity {
    NormalFragment fragment = new NormalFragment();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        getSupportFragmentManager().beginTransaction().add(R.id.contain,fragment).commit();
    }
}
