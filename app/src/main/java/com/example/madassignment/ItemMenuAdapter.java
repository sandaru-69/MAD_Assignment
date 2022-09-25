package com.example.madassignment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemMenuAdapter extends RecyclerView.Adapter<ItemMenuAdapter.ViewHolder> {

    List<ItemMenuModel> list;

    public ItemMenuAdapter(List<ItemMenuModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ItemMenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.food_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemMenuAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.price.setText(list.get(position).getPrice());
        holder.name.setText(list.get(position).getName());
        holder.description.setText(list.get(position).getDescription());
        holder.rating.setText(list.get(position).getRating());
        holder.timing.setText(list.get(position).getTiming());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name, price, description, rating, timing;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_img);
            price = itemView.findViewById(R.id.item_price);
            name = itemView.findViewById(R.id.item_name);
            description = itemView.findViewById(R.id.item_desc);
            rating = itemView.findViewById(R.id.item_rate);
            timing = itemView.findViewById(R.id.item_time);

        }
    }
}
