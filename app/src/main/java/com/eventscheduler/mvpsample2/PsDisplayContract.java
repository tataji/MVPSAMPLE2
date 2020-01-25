package com.eventscheduler.mvpsample2;

import com.eventscheduler.Repostory.model.ParentResponse;

public interface PsDisplayContract  {

    interface PsView extends BaseView<PsPresenter>{
        void showPsList(ParentResponse response);

    }
    interface PsPresenter extends BasePresenter{
          void getPsList();
    }
}
