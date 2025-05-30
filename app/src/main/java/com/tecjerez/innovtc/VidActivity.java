package com.tecjerez.innovtc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VidActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton homeBtn = findViewById(R.id.navHome);
        ImageButton vidBtn = findViewById(R.id.navVid);
        ImageButton escBtn = findViewById(R.id.navEsc);

        homeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(VidActivity.this, HomeActivity.class);
            startActivity(intent);
        });


        escBtn.setOnClickListener(v -> {
            Intent intent = new Intent(VidActivity.this, EscActivity.class);
            startActivity(intent);
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<itemVid> items = new ArrayList<itemVid>();
        items.add(new itemVid("Video tristeza", getString(R.string.vid_1), R.drawable.vidtristeza, "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Gtec4csp4TE?si=UZEQDQnv8jL8Xtzf\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"));
        items.add(new itemVid("Video felicidad", getString(R.string.vid_1), R.drawable.vidfelicidad, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/YLCpwnp9oaU?si=-34jrN7704Mg96cd\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"));
        items.add(new itemVid("Video miedo", getString(R.string.vid_1), R.drawable.vidmiedo, "<iframe width=\"560\" height=\"315\" src=\"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/myWOeFcCSO8?si=3rPt4UAx_8EXhg-7\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"));
        items.add(new itemVid("Video educativo", getString(R.string.vid_1), R.drawable.vid1, "<<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/myWOeFcCSO8?si=3rPt4UAx_8EXhg-7\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"));


        recyclerView.setAdapter(new MyAdapter(VidActivity.this, items));
    }
}
