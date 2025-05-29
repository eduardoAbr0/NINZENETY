package com.tecjerez.innovtc;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    TextView titulo, desc;
    WebView vid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        desc = findViewById(R.id.detailDesc);
        titulo = findViewById(R.id.detailTitle);
        vid = findViewById(R.id.detailVid);
        vid.getSettings().setJavaScriptEnabled(true);
        vid.setWebChromeClient(new WebChromeClient());
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            Log.d("WEBVIEW", "Contenido de Vid: " + bundle.getString("Vid"));
            desc.setText(bundle.getString("Desc"));
            vid.loadData(bundle.getString("Vid"),"text/html","utf-8");
            titulo.setText(bundle.getString("Titulo"));

        }
    }
}