package com.example.btvn_buoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class DangKy extends AppCompatActivity {

    Button btdk;
    EditText edtho, edtten, edtsdt, edtmk, edtngay, edtthang, edtnam;
    CheckBox cbfb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        layid();

        btdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(DangKy.this, HienThi.class);
                Account account = new Account();
                account.setTaikhoan(edtsdt.getText().toString());
                account.setMatkhau(edtmk.getText().toString());
                intent.putExtra("account", account);
                startActivity(intent);
            }
        });
    }
    private void layid(){
        btdk= findViewById(R.id.btdk);

        edtho= findViewById(R.id.edtho);
        edtten= findViewById(R.id.edtten);
        edtsdt= findViewById(R.id.edtsdt);
        edtmk= findViewById(R.id.edtmk);
        edtngay= findViewById(R.id.edtngay);
        edtthang= findViewById(R.id.edtthang);
        edtnam= findViewById(R.id.edtnam);

        cbfb= findViewById(R.id.cbfb);
    }
}