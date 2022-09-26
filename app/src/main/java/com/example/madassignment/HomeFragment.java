package com.example.madassignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    RecyclerView res;

    List<restaurantsmodel> resModelList;
    restaurantsadapter resAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        res = root.findViewById(R.id.restaurants);

        resModelList = new ArrayList<>();

        resModelList.add(new restaurantsmodel(R.drawable.kfc, "K F C", "25-30 min", "4.8", "Delivery Rs.180/-", "res1"));
        resModelList.add(new restaurantsmodel(R.drawable.mcdonalds, "McDonald's", "35-40 min", "5.0", "Delivery Rs.250/-", "res2"));
        resModelList.add(new restaurantsmodel(R.drawable.burgerking, "Burger King", "25-30 min", "4.7", "Delivery Rs.150/-", "res3"));
        //resModelList.add(new restaurantsmodel(R.drawable.breadtalk, "BreadTalk", "20-30 min", "4.6", "Delivery Rs.200/-", "res4"));
        resModelList.add(new restaurantsmodel(R.drawable.tacobell, "Taco Bell", "30-40 min", "5.0", "Delivery Rs.225/-", "res5"));

        resAdapter = new restaurantsadapter(getActivity(), resModelList);
        res.setAdapter(resAdapter);
        res.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        res.setHasFixedSize(true);
        res.setNestedScrollingEnabled(false);

        return root;
    }

}