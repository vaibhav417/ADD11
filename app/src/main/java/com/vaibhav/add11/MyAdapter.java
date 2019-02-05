package com.vaibhav.add11;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Item> {

    ArrayList<Item> animalList = new ArrayList<>();

    public MyAdapter(Context context, int textViewResourceId, ArrayList<Item> objects) {
        super(context, textViewResourceId, objects);
        animalList = objects;

    }

    @Override
    public int getCount() {
        return super.getCount();
    }


    @Override
    public View getView(int position,View convertView,  ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.custom_list_view_item, null);
        TextView textView = v.findViewById(R.id.textViewCustom);
        ImageView imageView = v.findViewById(R.id.imageViewCustom);
        textView.setText(animalList.get(position).getAnimalNmae());
        imageView.setImageResource(animalList.get(position).getAnimalImage());

        return v;

    }
}