package com.example.btvn_buoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editsdt, editmk;
    Button btdn, btqmk, btdk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ham();
        btdn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, HienThi.class);
                Account account = new Account();
                account.setTaikhoan(editsdt.getText().toString());
                account.setMatkhau(editmk.getText().toString());
                intent.putExtra("account", account);
                startActivity(intent);
            }
        });
        btdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DangKy.class);
                startActivity(intent);
            }
        });
    }
    private void ham(){
        editsdt = findViewById(R.id.editsdt);
        editmk= findViewById(R.id.editmk);

        btdn = findViewById(R.id.btdn);
        btqmk= findViewById(R.id.btqmk);
        btdk= findViewById(R.id.btdk);
    }
}