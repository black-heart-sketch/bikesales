package com.example.onlineshop;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.onlineshop.adapter.RecentsAdapter;
import com.example.onlineshop.adapter.TopPlacesAdapter;
import com.example.onlineshop.modal.RecentsData;
import com.example.onlineshop.modal.TopPlacesData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Now here we will add some dummy data in our model class

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Mountain Bike ABC","USA","From $500", R.drawable.a));
        recentsDataList.add(new RecentsData("Road Bike XYZ","USA","From $700", R.drawable.b));
        recentsDataList.add(new RecentsData("Hybrid Bike DEF","USA","From $600", R.drawable.c));
        recentsDataList.add(new RecentsData("Electric Bike GHI","USA","From $1,200", R.drawable.d));
        recentsDataList.add(new RecentsData("Folding Bike JKL","USA","From $800", R.drawable.e));
        recentsDataList.add(new RecentsData("Gravel Bike MNO","USA","From $900", R.drawable.f));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Mountain Bike XYZ","USA","$500 - $1,200", R.drawable.j));
        topPlacesDataList.add(new TopPlacesData("Road Bike ABC","USA","$700 - $1,500", R.drawable.l8l));
        topPlacesDataList.add(new TopPlacesData("Hybrid Bike DEF","USA","$600 - $1,100", R.drawable.l9));
        topPlacesDataList.add(new TopPlacesData("Electric Bike GHI","USA","$1,200 - $2,500", R.drawable.a));
        topPlacesDataList.add(new TopPlacesData("Folding Bike JKL","USA","$800 - $1,400", R.drawable.b));

        setTopPlacesRecycler(topPlacesDataList);


        setTopPlacesRecycler(topPlacesDataList);
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }



}
