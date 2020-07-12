package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.demoapp.adapters.Mainscreen_adapter;
import com.example.demoapp.adapters.Parent_adapter;
import com.example.demoapp.models.Child_Object;
import com.example.demoapp.models.Mainscreen_Object;
import com.example.demoapp.models.parent_Object;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Parent_adapter parent_adapter;
    RecyclerView mainrecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Mainscreen_Object> arrayList=new ArrayList<>();
        arrayList.add(new Mainscreen_Object(R.drawable.main));
        arrayList.add(new Mainscreen_Object(R.drawable.main1));
        arrayList.add(new Mainscreen_Object(R.drawable.main2));
        arrayList.add(new Mainscreen_Object(R.drawable.main3));
        arrayList.add(new Mainscreen_Object(R.drawable.main4));

        ArrayList<Child_Object> child_objectList=new ArrayList<>();
        child_objectList.add(new Child_Object("Shahrukh Khan","actor",R.drawable.image));
        child_objectList.add(new Child_Object("Sanjay Datt","actor",R.drawable.image1));
        child_objectList.add(new Child_Object("Aishwarya Rai","actor",R.drawable.mp));
        child_objectList.add(new Child_Object("Amitabh Bachchan","actor",R.drawable.image3));
        child_objectList.add(new Child_Object("Arijit Singh","singer",R.drawable.mp1));
        ArrayList<Child_Object> child_objectList1=new ArrayList<>();
        child_objectList1.add(new Child_Object("Varun Dhawan","actor",R.drawable.tc));
        child_objectList1.add(new Child_Object("Alia Bhatt","actor",R.drawable.tc1));
        child_objectList1.add(new Child_Object("Sidharth Malhotra","actor",R.drawable.tc2));
        child_objectList1.add(new Child_Object("Shirley Setie","singer",R.drawable.tc3));
        child_objectList1.add(new Child_Object("Pulkit Samrat","actor",R.drawable.tc4));
        ArrayList<Child_Object> child_objectList2=new ArrayList<>();
        child_objectList2.add(new Child_Object("SaraAli Khan","actor",R.drawable.no));
        child_objectList2.add(new Child_Object("Ananya Pande","actor",R.drawable.no1));
        child_objectList2.add(new Child_Object("Tiger Shroff","actor",R.drawable.no2));
        child_objectList2.add(new Child_Object("Harshvardhan Kapoor","actor",R.drawable.no3));

        ArrayList<Child_Object> child_objectList3=new ArrayList<>();
        child_objectList3.add(new Child_Object("Will Smith","actor",R.drawable.hp));
        child_objectList3.add(new Child_Object("Tom Cruise","actor",R.drawable.hp1));
        child_objectList3.add(new Child_Object("Dwayne Jhonson","actor",R.drawable.hp2));
        child_objectList3.add(new Child_Object("Lionardo Dcaprio","actor",R.drawable.hp3));
        child_objectList3.add(new Child_Object("Jhonny Depp","actor",R.drawable.hp4));
        ArrayList<parent_Object> parent_objectList=new ArrayList<>();
        parent_objectList.add(new parent_Object("Most Popular Celebrities",child_objectList));
        parent_objectList.add(new parent_Object("Treanding Celebrities",child_objectList1));
        parent_objectList.add(new parent_Object("New Additions",child_objectList2));
        parent_objectList.add(new parent_Object("Hollywood Popular",child_objectList3));

        setMain_Recycler(arrayList);
        setParent_Recycler(parent_objectList);

    }
    public void setMain_Recycler(ArrayList<Mainscreen_Object> arrayList)
    {
        mainrecyclerView=(RecyclerView)findViewById(R.id.RecyclerViewMain);
        mainrecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(MainActivity.this,mainrecyclerView.HORIZONTAL,false);
        mainrecyclerView.setLayoutManager(layoutManager);
        Mainscreen_adapter mainscreen_adapter=new Mainscreen_adapter(MainActivity.this,arrayList);
        mainrecyclerView.setAdapter(mainscreen_adapter);
    }

    public void setParent_Recycler(ArrayList<parent_Object> arrayList)
    {

        recyclerView=(RecyclerView)findViewById(R.id.recyclerViewParent);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        parent_adapter=new Parent_adapter(MainActivity.this,arrayList);
        recyclerView.setAdapter(parent_adapter);

    }
}