package main.repositories;

import com.example.domain.entities.DomainEntity;
import com.example.domain.interfaces.RepoInterface;

import java.util.ArrayList;

import main.entity.DataEntity;
import main.remote.SchoolRemoteDataSource;

public class SchoolRepositoryImplementation implements RepoInterface {

    SchoolRemoteDataSource dataSource;

    //should return all of the schools
    @Override
    public ArrayList<DomainEntity> getListOfClientObjects() {
        ArrayList<DataEntity> data = dataSource.getSchoolsData();
        return null;
    }

    //should return the specific school once detail is clicked
    @Override
    public DomainEntity getClientData() {


        //Since the Scores appear to
        //be returned as a list
        // should filter by the school name to
        // return the correct school data

        ArrayList<DataEntity> data = dataSource.getSchoolsData();

        // kotlin would allow a simple inline filter or map

        DomainEntity entity = new DomainEntity();
        entity.name = data.get(0).school_name;
        return entity;
    }

}
