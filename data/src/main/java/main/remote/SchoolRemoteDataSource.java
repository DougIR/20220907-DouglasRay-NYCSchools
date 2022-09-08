package main.remote;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import main.api.SchoolApi;
import main.entity.DataEntity;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SchoolRemoteDataSource {

    static Retrofit retrofit;

     public ArrayList<DataEntity> getSchoolsData() {

         ArrayList<DataEntity> data = new ArrayList<DataEntity>();

         /*Create handle for the RetrofitInstance interface*/

         // would have this injected so as not te repeat the code
         SchoolApi service = getRetrofitInstance().create(SchoolApi.class);
         Call<List<DataEntity>> call = service.getSchools();

         try {
             data = (ArrayList<DataEntity>) call.execute().body();
         } catch (IOException e) {
             e.printStackTrace();
         }

         return data;
     }

    public ArrayList<DataEntity> getScoresData() {

        ArrayList<DataEntity> data = new ArrayList<DataEntity>();

        /*Create handle for the RetrofitInstance interface*/
        // would have this injected so as not te repeat the code

        SchoolApi service = getRetrofitInstance().create(SchoolApi.class);
        Call<List<DataEntity>> call = service.getSchoolScores();

        try {
            data = (ArrayList<DataEntity>) call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }




    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl("https://data.cityofnewyork.us/Education")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
