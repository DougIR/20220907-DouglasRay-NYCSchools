package com.example.a20220907_douglasray_nycschools.ui.main;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a20220907_douglasray_nycschools.R;


import org.w3c.dom.Text;


public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    TextView message;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.main_fragment, container, false);
        message = v.findViewById(R.id.message);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

/*        //This will observer changes in the view model
        //data and automatically execute the resultant block
        //this allows you to use the observer pattern
        //it also uses the lifecucle owner and
        //will be cleaned up after this fragment is destroyed
        mViewModel.entity.observe(viewLifecycleOwner, { result ->
                message.text = result.name
        })*/

        // Get out data
        mViewModel.getSchools();


        // would be on click in adapter
        //when selecting the entity tell view model to
        // get details for the view and load details

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //switch to school detail frag

            }
        });
    }



}