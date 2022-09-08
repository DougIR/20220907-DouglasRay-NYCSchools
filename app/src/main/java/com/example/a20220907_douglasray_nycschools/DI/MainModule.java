package com.example.a20220907_douglasray_nycschools.DI;

public  class MainModule {

    //provides dependancy injection modules through the app



/*    private const val BASE_URL = ""

    //Provide injection for the network data
    // such as retrofite and ok http

    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .build()
    }

    @Provides
    fun ProvideRetrofit (okHttpClient: OkHttpClient)  : Retrofit {
        return  Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
    }


    @Provides
    fun ProvideDemoApi(retrofit: Retrofit): DemoApi {
        return retrofit.create(DemoApi::class.java)
    }


    //Provide injection for the data module
    //Data Module
    @Provides
    fun ProvideRepository(demoRemoteDataSource: DemoRemoteDataSource): DemoRepositoryImplementation {
        return DemoRepositoryImplementation(demoRemoteDataSource)
    }


    //Provide injection for use case's
    @Provides
    fun ProvideDemoUseCase(demoRepository: DemoRepositoryImplementation): GetDemoDetailsUseCase {
        return GetDemoDetailsUseCase(demoRepository)
    }*/


}
