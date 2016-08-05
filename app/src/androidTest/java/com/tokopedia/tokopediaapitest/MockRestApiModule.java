package com.tokopedia.tokopediaapitest;

import com.squareup.okhttp.mockwebserver.MockWebServer;

import java.io.IOException;

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
public class MockRestApiModule {

    MockWebServer mockWebServer;

    public MockRestApiModule() {
        mockWebServer = new MockWebServer();
        try {
            mockWebServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stopServer(){
        try {
            mockWebServer.shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Provides
    @Singleton
    Retrofit provideRetrovit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(mockWebServer.getUrl("/").toString())
                .client(new OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
