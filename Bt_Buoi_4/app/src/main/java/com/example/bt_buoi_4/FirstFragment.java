package com.example.bt_buoi_4;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends Fragment {


    private EditText edtemail, edtmk;
    private Button btchuyen;

    private View mView;
    private iSendData mISendData;
    public interface iSendData{
        void sendDataTK (String email);

        void sendDataMK(String pass);
    }

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mISendData = (iSendData) getActivity();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView= inflater.inflate(R.layout.fragment_first, container, false);

        edtemail= mView.findViewById(R.id.edtemail);
        edtmk= mView.findViewById(R.id.edtmk);
        btchuyen=mView.findViewById(R.id.btchuyen);

        btchuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mail = edtemail.getText().toString().trim();
                mISendData.sendDataTK(mail);
                String pass =edtmk.getText().toString().trim();
                mISendData.sendDataMK(pass);


            }
        });

        return mView;
    }


}