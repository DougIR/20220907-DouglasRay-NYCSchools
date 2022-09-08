package com.example.domain.usecase;

import com.example.domain.entities.DomainEntity;
import com.example.domain.interfaces.RepoInterface;

import java.util.ArrayList;

public class GetListOfClientObjectsUseCase {

    RepoInterface repoInterface;
    public ArrayList<DomainEntity> getData() {
        return  repoInterface.getListOfClientObjects();
    }
}
