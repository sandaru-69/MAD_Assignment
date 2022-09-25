package com.example.madassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class RestaurantItems extends AppCompatActivity {


    RecyclerView recyclerView;
    List<ItemMenuModel> itemMenuModelList;
    ItemMenuAdapter itemMenuAdapter;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_items);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.items);
        imageView = findViewById(R.id.menu_img);

        recyclerView.setLayoutManager((new LinearLayoutManager(this)));
        itemMenuModelList = new ArrayList<>();
        itemMenuAdapter = new ItemMenuAdapter(itemMenuModelList);
        recyclerView.setAdapter(itemMenuAdapter);

        if(type != null && type.equalsIgnoreCase("res1")) {
            itemMenuModelList.add(new ItemMenuModel(R.drawable.kfc1, "12 pcs crispy chicken bucket", "description", "4.5", "1500", "10am - 12pm"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.kfc1, "12 pcs crispy chicken bucket", "description", "4.5", "1500", "10am - 12pm"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.kfc1, "12 pcs crispy chicken bucket", "description", "4.5", "1500", "10am - 12pm"));
            itemMenuAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("res2")) {
            itemMenuModelList.add(new ItemMenuModel(R.drawable.kfc1, "12 pcs crispy chicken bucket", "description", "4.5", "1500", "10am - 12pm"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.kfc1, "12 pcs crispy chicken bucket", "description", "4.5", "1500", "10am - 12pm"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.kfc1, "12 pcs crispy chicken bucket", "description", "4.5", "1500", "10am - 12pm"));
            itemMenuAdapter.notifyDataSetChanged();
        }

    }
}