package com.example.android.moscowguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter<Place>  {

    public PlaceAdapter(Context context, ArrayList<Place> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView titleTextView = (TextView) convertView.findViewById(R.id.place_title);
        titleTextView.setText(currentPlace.getTitleResourceId());

        TextView addressTextView = (TextView) convertView.findViewById(R.id.place_address);
        addressTextView.setText(currentPlace.getAddressResourceId());

        TextView descriptionTextView = (TextView) convertView.findViewById(R.id.place_description);
        descriptionTextView.setText(currentPlace.getDescriptionResourceId());

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getImageResourceId());

        return convertView;
    }
}