package com.example.digitallibrarylessonplan2;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Retrofitclient {

    private static final String base_url="http://192.168.18.48:4500/api/User/";
    private static Retrofitclient mInstance;
    private Retrofit retrofit;

    private Retrofitclient()
    {
        retrofit=new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static synchronized Retrofitclient getInstance()
    {
        if(mInstance==null)
        {
            mInstance=new Retrofitclient();
        }
        return mInstance;
    }
    public Api getApi()
    {
        return retrofit.create(Api.class);
    }
}
