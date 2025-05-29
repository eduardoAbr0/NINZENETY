package com.tecjerez.innovtc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

    Context context;
    List<itemVid> items;

    public MyAdapter(Context context, List<itemVid> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_item, parent,  false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tituloV.setText(items.get(position).getTitulo());
        holder.descV.setText(items.get(position).getImg());
        holder.imgV.setImageResource(items.get(position).getImg());

        holder.cardV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("Vid", items.get(holder.getAdapterPosition()).getVid());
                intent.putExtra("Titulo", items.get(holder.getAdapterPosition()).getTitulo());
                intent.putExtra("Desc", items.get(holder.getAdapterPosition()).getDescripcion());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
