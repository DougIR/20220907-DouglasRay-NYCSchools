package com.example.a20220907_douglasray_nycschools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a20220907_douglasray_nycschools.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}