package com.example.btvn_buoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HienThi extends AppCompatActivity {


    Button btthoat;
   // TextView getSdt, getMk;
    TextView tvtk,tvmk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky2);

        btthoat= findViewById(R.id.btthoat);

        tvtk=findViewById(R.id.tvtk);
        tvmk=findViewById(R.id.tvmk);

        Intent intent= getIntent();
        Account account= intent.getParcelableExtra("account");
        //System.out.println(account.getTaikhoan()+" - "+account.getMatkhau());

        tvtk.setText("Tài khoản: "+ account.getTaikhoan());
        tvmk.setText("Mật khẩu: "+ account.getMatkhau());

        btthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HienThi.this, MainActivity.class));

            }
        });
    }


}