package com.tecjerez.innovtc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class EscActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escaneo);

        ImageButton homeBtn = findViewById(R.id.navHome);
        ImageButton vidBtn = findViewById(R.id.navVid);
        ImageButton escBtn = findViewById(R.id.navEsc);

        homeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(EscActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        vidBtn.setOnClickListener(v -> {
            Intent intent = new Intent(EscActivity.this, VidActivity.class);
            startActivity(intent);
        });

        escBtn.setOnClickListener(v -> {
            Intent intent = new Intent(EscActivity.this, EscActivity.class);
            startActivity(intent);
        });

    }
}
