package com.example.bt_buoi_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class SecondFragment extends Fragment {


    private EditText edttk, edtpass;

    private View mView;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView= inflater.inflate(R.layout.fragment_second, container, false);

        edttk= mView.findViewById(R.id.edttk);
        edtpass = mView.findViewById(R.id.edtpass);


        return mView;
    }


    public void rDataFromF1Tk(String email){
        edttk.setText(email);

    }


    public void rDataFromF1MK(String pass) {
        edtpass.setText(pass);
    }
}