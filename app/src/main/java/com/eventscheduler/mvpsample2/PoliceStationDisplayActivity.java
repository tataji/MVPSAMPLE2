package com.eventscheduler.mvpsample2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.eventscheduler.Repostory.PsDisplayRemoteDataSource;
import com.eventscheduler.Repostory.PsDisplayRepository;

public class PoliceStationDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragment
        PsDisplayFragment psDisplayFragment=new PsDisplayFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(psDisplayFragment,"sdf");
        fragmentTransaction.commit();

        //presenter
         PsDisplayPresnter psDisplayPresnter=new PsDisplayPresnter(psDisplayFragment, PsDisplayRepository.getInstance(PsDisplayRemoteDataSource.getInstance()));

    }
}
