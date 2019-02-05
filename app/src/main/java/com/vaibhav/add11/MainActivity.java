package com.vaibhav.add11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    ArrayList<Item> animalList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList= findViewById(R.id.SLVC);
        animalList.add(new Item("Tiger",R.drawable.image1));
        animalList.add(new Item("Cat",R.drawable.images2));
        animalList.add(new Item("Birds",R.drawable.image3));
        animalList.add(new Item("Parrot",R.drawable.images4));
        animalList.add(new Item("Dog",R.drawable.images5));
        MyAdapter myAdapter = new MyAdapter (this,R.layout.custom_list_view_item,animalList);
        simpleList.setAdapter(myAdapter);

    }

}
