package com.dream.lemon.hackathon.ui.welcome;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.dream.lemon.hackathon.R;
import com.dream.lemon.hackathon.utils.ActivityUtils;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root_container);

        WelcomeFragment fragment = WelcomeFragment.newInstance();
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), fragment,
                R.id.contentFrame);

        new WelcomePresenter(fragment).start();
    }
}