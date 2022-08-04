package com.example.drassistant;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;

public class user_adapter extends RecyclerView.Adapter<user_adapter.Viewholder> {

    Context context;
    ArrayList<user_model> list;

    public user_adapter(ArrayList<user_model> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.sample_user,viewGroup,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int i) {

        user_model user_model = list.get(i);

        holder.userTV.setText(user_model.getName());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends  RecyclerView.ViewHolder{

        TextView userTV;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            userTV = itemView.findViewById(R.id.TVsample_user);


        }
    }

}
