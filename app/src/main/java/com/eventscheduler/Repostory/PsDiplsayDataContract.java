package com.eventscheduler.Repostory;

import com.eventscheduler.Repostory.model.ParentResponse;

public interface PsDiplsayDataContract {

    interface PsListCallBack{
        void OnSuccess(ParentResponse parentResponse);
        void onFailure();
    }
    void getPsList(PsListCallBack callBack);

}
