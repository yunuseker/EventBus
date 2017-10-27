package com.younus.sameexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onStart() {

        super.onStart();
        GlobalBus.getBus().register(this);
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        GlobalBus.getBus().unregister(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onEvent(DataEvent.sendUser user) {
        Log.i("username ", user.getUser().getUsername());
        Log.i("password ", user.getUser().getPassword());

    }
}
