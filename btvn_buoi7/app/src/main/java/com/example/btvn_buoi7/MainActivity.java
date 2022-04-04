package com.example.btvn_buoi7;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    List <GhiChu> list = new ArrayList<>();
    DataSQLite dataSQLite;
    RecyclerView recyclerView;
    RecyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nd = findViewById(R.id.nd);
        Button them = findViewById(R.id.add);
        dataSQLite = new DataSQLite(this, "datalite.sqlite", null, 1);
        dataSQLite.QueryData("DROP TABLE GhiChu");
        dataSQLite.QueryData("Create table if not EXISTS GhiChu(id INTEGER PRIMARY KEY AUTOINCREMENT, Noidung NVARCHAR(1000))");
        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataSQLite.QueryData("INSERT INTO GhiChu VALUES (null,'"+nd.getText().toString()+"')");
                GetData();
                nd.setText("");
            }
        });
        GetData();
    }
    public void xoa(int pos) {
        dataSQLite.QueryData("DELETE FROM GhiChu WHERE Id ='"+list.get(pos).getId()+"'");
        list.remove(pos);
        recyclerView.setAdapter(adapter);
    }

    public void GetData() {
        Cursor cursor = dataSQLite.GetData("Select * From GhiChu");
        list.clear();
        while(cursor.moveToNext()){
            int id = cursor.getInt(0);
            String str = cursor.getString(1);
            list.add(new GhiChu(id , str));
        }
        recyclerView = findViewById(R.id.recy);
        adapter = new RecyAdapter(list, MainActivity.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

}