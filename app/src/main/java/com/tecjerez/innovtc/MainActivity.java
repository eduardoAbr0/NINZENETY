package com.tecjerez.innovtc;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.creacion_p);

        /*
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<itemVid> items = new ArrayList<itemVid>();
        items.add(new itemVid("Video educativo 1", getString(R.string.vid_1), R.drawable.vid1, "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/V2KCAfHjySQ?si=2XO23qYR6D8w3BAV\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"));
        items.add(new itemVid("Video educativo educativo 2", getString(R.string.vid_1), R.drawable.vid1, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/V2KCAfHjySQ?si=U-wtH0EgAywWZWk_\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"));
        items.add(new itemVid("Video educativo educativo 3", getString(R.string.vid_1), R.drawable.vid1, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/V2KCAfHjySQ?si=U-wtH0EgAywWZWk_\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"));
        items.add(new itemVid("Video educativo educativo 4", getString(R.string.vid_1), R.drawable.vid1, "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/V2KCAfHjySQ?si=U-wtH0EgAywWZWk_\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"));


        recyclerView.setAdapter(new MyAdapter(MainActivity.this, items));*/
    }
}