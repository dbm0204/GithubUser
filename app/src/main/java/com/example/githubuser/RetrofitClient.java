package com.example.githubuser;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofitClient;
    public static final String url = "https://api.github.com/";
    public static Retrofit getRetrofitInstance(){
        if(retrofitClient == null){
            retrofitClient = new retrofit2.Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitClient;
    }
}
