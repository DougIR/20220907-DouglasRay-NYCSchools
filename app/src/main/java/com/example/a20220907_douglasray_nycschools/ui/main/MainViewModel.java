package com.example.a20220907_douglasray_nycschools.ui.main;

import androidx.lifecycle.ViewModel;

import com.example.a20220907_douglasray_nycschools.entities.DisplayEntity;
import com.example.domain.entities.DomainEntity;
import com.example.domain.usecase.GetClientObjectDetailsUseCase;
import com.example.domain.usecase.GetListOfClientObjectsUseCase;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    // should replace with DI
    public GetListOfClientObjectsUseCase getListOfClientObjectsUseCase = new GetListOfClientObjectsUseCase();


    // would have display for schools and school details
    // would make privte with public readonly
    public List<DisplayEntity> schools = new ArrayList<>();


    public void getSchools() {
        List<DomainEntity> entities = getListOfClientObjectsUseCase.getData();

        //map the domain entities to the UI entities here

        for (DomainEntity entity : entities) {
            schools.add(new DisplayEntity()); // example would use map to actually map multiple properties here
        }

    }
}