package com.bignerdranch.android.nerdlauncher;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nerd_launcher, menu);
        return true;
    }
    
}
