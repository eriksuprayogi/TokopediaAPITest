package com.tokopedia.tokopediaapitest;

import android.util.Log;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.tokopedia.tokopediaapitest.component.RestApiComponent;
import com.tokopedia.tokopediaapitest.model.Product;
import com.tokopedia.tokopediaapitest.service.ApiService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, application = AppAplication.class, sdk = 22)
public class ExampleUnitTest {

    @Inject
    Retrofit retrofit;

    private ApiService apiService;

    @Before
    public void setUp(){
    }

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testBrowseProductApi(){
    }
}