package com.tokopedia.tokopediaapitest.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Erry on 8/4/2016.
 */

@Module
public class RestApiModule {

    private static final String BASE_URL = "https://ajax.tokopedia.com/";

    @Provides
    @Singleton
    Retrofit provideRetrovit(){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .client(new OkHttpClient())
                .build();
        return retrofit;
    }
}
