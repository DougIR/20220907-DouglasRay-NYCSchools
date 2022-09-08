package main.api;

import java.util.List;

import main.entity.DataEntity;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface SchoolApi {
    @GET("2017-DOE-High-School-Directory/s3k6-pzi2")
    Call<List<DataEntity>> getSchools();

    @GET("2012-SAT-Results/f9bf-2cp4")
    Call<List<DataEntity>> getSchoolScores();
}
