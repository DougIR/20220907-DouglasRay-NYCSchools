package com.example.a20220907_douglasray_nycschools.SchoolDetail.ui.main;

import androidx.lifecycle.ViewModel;

import com.example.a20220907_douglasray_nycschools.entities.DisplayEntity;
import com.example.domain.entities.DomainEntity;
import com.example.domain.usecase.GetClientObjectDetailsUseCase;

public class SchoolDetailViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    public GetClientObjectDetailsUseCase getClientObjectDetailsUseCase = new GetClientObjectDetailsUseCase();
    public DisplayEntity schoolDetailView = new DisplayEntity();


    public void getDataForDisplay() {
        DomainEntity entity = getClientObjectDetailsUseCase.getData();
        schoolDetailView.name = entity.name;
        // would need to hook this up to the UI using view binding or use observale pattern
    }
}