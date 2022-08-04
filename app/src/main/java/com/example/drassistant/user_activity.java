package com.example.drassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class user_activity extends AppCompatActivity {

    ImageView useradd;
    RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    public ArrayList<user_model> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        useradd = findViewById(R.id.imgUserAdd);
        recyclerView = findViewById(R.id.userRV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();

        for(int i=0; i<=10; i++){
            user_model model = new user_model(" user "+i);
            list.add(model);
        }

        adapter = new user_adapter(list,this);
        recyclerView.setAdapter(adapter);

        useradd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user_activity.this,user_add_activity.class);
                startActivity(intent);
            }
        });


    }
}