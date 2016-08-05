package com.tokopedia.tokopediaapitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tokopedia.tokopediaapitest.model.Product;
import com.tokopedia.tokopediaapitest.service.ApiService;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    Retrofit retrofit;
    @BindView(R.id.text)
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ((AppAplication) getApplication()).getComponent().inject(this);
    }

    @OnClick(R.id.btn_test)
    public void onClick() {
        ApiService apiService = retrofit.create(ApiService.class);
        apiService.getProduct().enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                if (response.isSuccessful()) {
                    Product product = response.body();
                    StringBuilder builder = new StringBuilder();
                    for (Product.Data data : product.getData()) {
                        builder.append(data.getName());
                        builder.append("\n");
                    }
                    text.setText(builder.toString());
                }
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {

            }
        });
    }


}
