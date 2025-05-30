package com.tecjerez.innovtc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_pg);

        ImageButton homeBtn = findViewById(R.id.navHome);
        ImageButton vidBtn = findViewById(R.id.navVid);
        ImageButton escBtn = findViewById(R.id.navEsc);

        homeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        vidBtn.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, VidActivity.class);
            startActivity(intent);
        });

        escBtn.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, EscActivity.class);
            startActivity(intent);
        });
    }
}
