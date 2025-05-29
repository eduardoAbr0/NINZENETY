package com.tecjerez.innovtc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imgV;
    TextView tituloV, descV;
    CardView cardV;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        cardV = itemView.findViewById(R.id.recCard);
        imgV = itemView.findViewById(R.id.recImg);
        tituloV = itemView.findViewById(R.id.recTitulo);
        descV = itemView.findViewById(R.id.recDesc);
    }
}
