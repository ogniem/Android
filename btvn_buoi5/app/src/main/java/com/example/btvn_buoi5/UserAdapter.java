package com.example.btvn_buoi5;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter  extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    private List<User> mListUser;

    public UserAdapter(List<User> mListUser) {
        this.mListUser = mListUser;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent,false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        User user= mListUser.get(position);
        if(user==null)
            return ;
        holder.img_avt.setImageResource(user.getResourceId());
        holder.tv_sector.setText(user.getSector());
        holder.tv_name.setText(user.getName());
        holder.tv_price.setText(user.getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
           int cnt=0;
            @Override
            public void onClick(View view) {
                cnt++;
                if(cnt % 2 != 0) {
                    holder.itemView.setBackgroundColor(Color.parseColor("#ff7b00"));
                } else {
                    holder.itemView.setBackgroundColor(Color.parseColor("#121212"));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mListUser != null)
            return mListUser.size();
        return 0;
    }

    public  class UserViewHolder extends RecyclerView.ViewHolder{

        private ImageView img_avt;
        private TextView tv_sector;
        private TextView tv_name;
        private  TextView tv_price;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            img_avt= itemView.findViewById(R.id.img_avt);
            tv_sector= itemView.findViewById(R.id.tv_sector);
            tv_name= itemView.findViewById(R.id.tv_name);
            tv_price= itemView.findViewById(R.id.tv_price);

        }
    }
}
