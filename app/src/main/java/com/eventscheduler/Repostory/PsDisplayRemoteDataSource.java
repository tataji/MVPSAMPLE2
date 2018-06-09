package com.eventscheduler.Repostory;

import android.util.Log;

import com.eventscheduler.Repostory.model.ParentResponse;
import com.eventscheduler.Repostory.remotedata.PsDisplayRemote;
import com.eventscheduler.Repostory.remotedata.RetrofitConnect;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PsDisplayRemoteDataSource implements PsDiplsayDataContract {
    public static PsDisplayRemoteDataSource INSTANCE=null;
    public static PsDisplayRemoteDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PsDisplayRemoteDataSource();
        }
        return INSTANCE;
    }

    @Override
    public void getPsList(final PsListCallBack callBack) {

        PsDisplayRemote loginRemote = RetrofitConnect.createService(PsDisplayRemote.class);

        loginRemote.GetSCPSList("3201").enqueue(new Callback<ParentResponse>() {
            @Override
            public void onResponse(Call<ParentResponse> call, Response<ParentResponse> response) {
                callBack.OnSuccess(response.body());
            }

            @Override
            public void onFailure(Call<ParentResponse> call, Throwable t) {
                 callBack.onFailure();
            }
        });
    }
}
