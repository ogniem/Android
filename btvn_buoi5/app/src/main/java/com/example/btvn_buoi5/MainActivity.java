package com.example.btvn_buoi5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView revData;
    private UserAdapter userAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        revData= findViewById(R.id.rcv_data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        revData.setLayoutManager(linearLayoutManager);
        RecyclerView.ItemDecoration itemDecoration= new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        revData.addItemDecoration(itemDecoration);

        userAdapter = new UserAdapter(getListUser());
        revData.setAdapter(userAdapter);

    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.img_11, "Pizza", "Spicy Chicken Pizza", "RS 310.00"));
        list.add(new User(R.drawable.img_2, "Hamburger", "Chicken Burger", "RS 300.00"));
        list.add(new User(R.drawable.img_11, "Pizza", "Spicy Chicken Pizza", "RS 310.00"));
        list.add(new User(R.drawable.img_11, "Pizza", "Spicy Chicken Pizza", "RS 310.00"));
        list.add(new User(R.drawable.img_11, "Pizza", "Spicy Chicken Pizza", "RS 310.00"));
        list.add(new User(R.drawable.img_2, "Hamburger", "Chicken Burger", "RS 300.00"));
        list.add(new User(R.drawable.img_11, "Pizza", "Spicy Chicken Pizza", "RS 310.00"));
        list.add(new User(R.drawable.img_11, "Pizza", "Spicy Chicken Pizza", "RS 310.00"));
        list.add(new User(R.drawable.img_11, "Pizza", "Spicy Chicken Pizza", "RS 310.00"));
        list.add(new User(R.drawable.img_2, "Hamburger", "Chicken Burger", "RS 300.00"));
        list.add(new User(R.drawable.img_11, "Pizza", "Spicy Chicken Pizza", "RS 310.00"));
        list.add(new User(R.drawable.img_11, "Pizza", "Spicy Chicken Pizza", "RS 310.00"));
        return  list;
    }
}