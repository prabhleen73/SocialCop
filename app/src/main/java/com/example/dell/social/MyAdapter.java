package com.example.dell.social;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Dell on 3/1/2018.
 */

public class MyAdapter extends ArrayAdapter<ImageUploadInfo> {

    Activity activity;
    int resource;
    List<ImageUploadInfo> list;


    public MyAdapter(Activity activity,int resource,List<ImageUploadInfo> list) {
        super(activity, resource, list);
        this.activity=activity;
        this.resource=resource;
        this.list=list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = activity.getLayoutInflater();

        View view = layoutInflater.inflate(resource,null);


        ImageView imageView = (ImageView) view.findViewById(R.id.getImages);
        TextView name = (TextView) view.findViewById(R.id.getName);
        TextView location = view.findViewById(R.id.getLocation);


        name.setText("Problem :- " + list.get(position).getName());
        location.setText("Location :- " + list.get(position).getLocation());
        Glide.with(activity).load(list.get(position).getImageUri()).into(imageView);
        return view;
    }

    }

