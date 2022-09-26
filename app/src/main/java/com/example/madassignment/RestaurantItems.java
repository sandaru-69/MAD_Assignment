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
            itemMenuModelList.add(new ItemMenuModel(R.drawable.kfc1, "Crispy Chicken Bucket", "-----", "2500"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.kfc2, "Zinger Burger", "-----", "1000"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.kfc3, "Fries", "-----", "500"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.kfc4, "Chicken Wings", "-----", "550"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.kfc5, "Chicken Biryani", "-----", "700"));
            itemMenuAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("res2")) {
            itemMenuModelList.add(new ItemMenuModel(R.drawable.mcd1, "Chicken McSpicy", "-----", "1100"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.mcd2, "McWings", "-----", "800"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.mcd3, "McNuggets", "-----", "800"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.mcd4, "Big Mac", "-----", "1500"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.mcd5, "Oreo McFlurry", "-----", "500"));
            itemMenuAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("res3")) {
            itemMenuModelList.add(new ItemMenuModel(R.drawable.bk1, "WHOPPER", "-----", "1500"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.bk2, "Crispy Chicken Burger", "-----", "1200"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.bk3, "BK Rice", "-----", "700"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.bk4, "BK Sub", "-----", "1000"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.bk5, "Fries", "-----", "600"));
            itemMenuAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("res5")) {
            itemMenuModelList.add(new ItemMenuModel(R.drawable.taco1, "Classic Taco", "-----", "800"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.taco2, "Naked Chicken Taco", "-----", "1000"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.taco3, "Burrito", "-----", "1300"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.taco4, "Nachos", "-----", "800"));
            itemMenuModelList.add(new ItemMenuModel(R.drawable.taco5, "Quesadilla", "-----", "600"));
            itemMenuAdapter.notifyDataSetChanged();
        }
    }
}