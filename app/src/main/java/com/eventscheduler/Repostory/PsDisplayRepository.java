package com.eventscheduler.Repostory;

import com.eventscheduler.Repostory.model.ParentResponse;

public class PsDisplayRepository implements PsDiplsayDataContract{

    public static PsDisplayRepository INSTANCE=null;
    public PsDisplayRemoteDataSource psDisplayRemoteDataSource;

    public PsDisplayRepository(PsDisplayRemoteDataSource psDisplayRemoteDataSource){
        this.psDisplayRemoteDataSource=psDisplayRemoteDataSource;
    }

    public static PsDisplayRepository getInstance(PsDisplayRemoteDataSource PsDisplayRepository) {

        if (INSTANCE == null) {
            INSTANCE = new PsDisplayRepository(PsDisplayRepository);
        }
        return INSTANCE;
    }


    @Override
    public void getPsList(final PsListCallBack callBack) {
        psDisplayRemoteDataSource.getPsList(new PsListCallBack() {
            @Override
            public void OnSuccess(ParentResponse parentResponse) {
                callBack.OnSuccess(parentResponse);
            }

            @Override
            public void onFailure() {

            }
        });
    }
}
