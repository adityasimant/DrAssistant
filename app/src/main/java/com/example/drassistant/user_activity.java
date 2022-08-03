package com.example.drassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class user_activity extends AppCompatActivity {

    ImageView useradd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        useradd = findViewById(R.id.imgUserAdd);

        useradd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user_activity.this,user_add_activity.class);
                startActivity(intent);
            }
        });


    }
}