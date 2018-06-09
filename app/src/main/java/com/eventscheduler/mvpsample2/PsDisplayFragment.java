package com.eventscheduler.mvpsample2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eventscheduler.Repostory.model.ParentResponse;

public class PsDisplayFragment extends Fragment implements PsDisplayContract.PsView {
    PsDisplayContract.PsPresenter psPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.psdisplayfragment, container, false);
        psPresenter.start();
        psPresenter.getPsList();
        return root;
    }



    @Override
    public void setPresenter(PsDisplayContract.PsPresenter psPresenter) {
       this.psPresenter= psPresenter;
    }

    @Override
    public void showPsList(ParentResponse response) {

    }
}
