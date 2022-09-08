package com.example.a20220907_douglasray_nycschools.SchoolDetail.ui.main;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a20220907_douglasray_nycschools.R;

public class SchoolDetailFragment extends Fragment {

    public static SchoolDetailFragment newInstance() {
        return new SchoolDetailFragment();
    }

    private SchoolDetailViewModel mViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.school_detail_layout, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SchoolDetailViewModel.class);
        // TODO: Use the ViewModel


        //would fetch the detail for this fragment ...
    }

}