package com.example.a20220907_douglasray_nycschools.SchoolDetail;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.a20220907_douglasray_nycschools.SchoolDetail.ui.main.SchoolDetailFragment;

public class SchoolDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.school_detail_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, SchoolDetailFragment.newInstance())
                .commitNow();
        }
    }
}