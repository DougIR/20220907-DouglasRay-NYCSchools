package com.example.domain.usecase;

import com.example.domain.entities.DomainEntity;
import com.example.domain.interfaces.RepoInterface;

public class GetClientObjectDetailsUseCase {

    RepoInterface repoInterface;
    public DomainEntity getData() {
       return  repoInterface.getClientData();
    }
}
