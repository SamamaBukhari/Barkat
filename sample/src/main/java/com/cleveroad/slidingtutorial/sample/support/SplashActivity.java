package com.cleveroad.slidingtutorial.sample.support;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cleveroad.slidingtutorial.sample.*;

/**
 * Created by samam on 12/2/2016.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, com.cleveroad.slidingtutorial.sample.support.MainActivity.class);
        startActivity(intent);
        finish();
    }
}