package com.example.admin.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class RetrofitClass {
    public static final String ROOT_URL = "https://github.com/Thirupathi76/SearchMap/raw/master/Parkingplaces/";



    private static Retrofit getRetrofitInstance() {

        return new Retrofit.Builder()

                .baseUrl(ROOT_URL)

                .addConverterFactory(GsonConverterFactory.create())

                .build();

    }

    public static ApiService getApiService() {

        return getRetrofitInstance().create(ApiService.class);

    }
}

