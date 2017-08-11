package com.wang.leaksdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SampleListener{
    BigObject bigObject = new BigObject();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListenerManager.getInstance().addListener(this);
    }

    @Override
    public void soSomeThing() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ListenerManager instance = ListenerManager.getInstance();
        instance.removeListener(this);
    }
}
