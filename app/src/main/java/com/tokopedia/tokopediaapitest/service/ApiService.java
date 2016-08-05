package com.tokopedia.tokopediaapitest.service;

import com.tokopedia.tokopediaapitest.model.Product;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Erry on 8/3/2016.
 */
public interface ApiService {

    @GET("search/v2/product")
    Call<Product> getProduct();

}
