package com.tokopedia.tokopediaapitest;

import android.app.Application;
import android.os.Bundle;

import com.tokopedia.tokopediaapitest.component.RestApiComponent;
import com.tokopedia.tokopediaapitest.module.RestApiModule;
import com.tokopedia.tokopediaapitest.service.ApiService;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Erry on 8/3/2016.
 */
public class AppAplication extends Application {

    @Singleton
    @Component(modules = RestApiModule.class)
    public interface ProdComponent extends RestApiComponent {

    }

    @Inject
    Retrofit retrofit;
    RestApiComponent component = null;

    @Override
    public void onCreate() {
        super.onCreate();
        if(component == null){
            component = DaggerAppAplication_ProdComponent.builder().restApiModule(new RestApiModule()).build();
        }
    }

    public RestApiComponent getComponent() {
        return component;
    }

    public void setComponent(RestApiComponent component) {
        this.component = component;
    }
}
