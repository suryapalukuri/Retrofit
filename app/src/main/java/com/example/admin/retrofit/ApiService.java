package com.example.admin.retrofit;

import retrofit2.http.GET;

interface ApiService {
    @GET("cricket.json")
    retrofit2.Call<Categories> getCategories();
}
