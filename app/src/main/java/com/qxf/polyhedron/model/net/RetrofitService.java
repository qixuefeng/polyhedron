package com.qxf.polyhedron.model.net;

import com.qxf.polyhedron.BuildConfig;
import com.qxf.polyhedron.constants.NetConstants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 网络访问框架
 * Created by qixuefeng on 2017/12/11.
 */

public class RetrofitService {

    private static RetrofitService instance = null;

    public static RetrofitService getInstance() {
        if (instance == null) {
            instance = new RetrofitService();
        }
        return instance;
    }

    private Retrofit retrofit;
    private OkHttpClient okHttpClient;

    private RetrofitService() {
        if (BuildConfig.DEBUG) {

            okHttpClient = new OkHttpClient();

            retrofit = new Retrofit.Builder()
                    .baseUrl(NetConstants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(okHttpClient)
                    .build();

        } else {

            okHttpClient = new OkHttpClient();

            retrofit = new Retrofit.Builder()
                    .baseUrl(NetConstants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(okHttpClient)
                    .build();

        }
    }

    public <T> T createApi(Class<T> clazz){
        return retrofit.create(clazz);
    }

}
