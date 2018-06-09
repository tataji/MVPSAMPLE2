package com.eventscheduler.mvpsample2;

import android.util.Log;

import com.eventscheduler.Repostory.PsDiplsayDataContract;
import com.eventscheduler.Repostory.PsDisplayRepository;
import com.eventscheduler.Repostory.model.ParentResponse;
import com.eventscheduler.Repostory.remotedata.RetrofitConnect;

public class PsDisplayPresnter implements PsDisplayContract.PsPresenter{
    PsDisplayRepository psDisplayRepository;
    PsDisplayContract.PsView view;

    public PsDisplayPresnter(PsDisplayFragment psDisplayFragment, PsDisplayRepository  psDisplayRepository) {
      this.psDisplayRepository=psDisplayRepository;
      this.view=psDisplayFragment;
      this.view.setPresenter(this);

    }

    @Override
    public void getPsList() {
        psDisplayRepository.getPsList(new PsDiplsayDataContract.PsListCallBack() {
            @Override
            public void OnSuccess(ParentResponse parentResponse) {
                Log.d("rsf",parentResponse.getPSlist().get(0).getPsname());
                view.showPsList(parentResponse);
            }

            @Override
            public void onFailure() {

            }
        });

    }

    @Override
    public void start() {
        RetrofitConnect.init();
    }
}
