package com.example.bt_buoi_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FirstFragment.iSendData{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.contentf1,new FirstFragment());
        fragmentTransaction.add(R.id.contentf2,new SecondFragment());
        fragmentTransaction.commit();
    }

    @Override
    public void sendDataTK(String email) {
        SecondFragment secondFragment = (SecondFragment) getSupportFragmentManager().findFragmentById(R.id.contentf2);
        secondFragment.rDataFromF1Tk(email);

    }
    @Override
    public void sendDataMK(String pass) {
        SecondFragment secondFragment = (SecondFragment) getSupportFragmentManager().findFragmentById(R.id.contentf2);
        secondFragment.rDataFromF1MK(pass);

    }


}