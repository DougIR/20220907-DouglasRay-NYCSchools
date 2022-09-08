package com.example.domain.interfaces;

import com.example.domain.entities.DomainEntity;

import java.util.ArrayList;

public interface RepoInterface {
    ArrayList<DomainEntity> getListOfClientObjects();
    DomainEntity getClientData();
}
