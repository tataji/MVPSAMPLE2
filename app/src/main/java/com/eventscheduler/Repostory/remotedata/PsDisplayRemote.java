package com.eventscheduler.Repostory.remotedata;



import com.eventscheduler.Repostory.model.ParentResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PsDisplayRemote {

    @GET("GetSCPSList")
    Call<ParentResponse> GetSCPSList(@Query("DistrictCd") String distcode);






}

