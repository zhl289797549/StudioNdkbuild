package com.example.administrator.hellojni_ndkbuild;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    int version = 100;
    int modifid  =1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
