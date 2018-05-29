package com.example.android.moscowguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumFragment extends Fragment {

    public MuseumFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.title_museum_tretyakov, R.string.address_museum_tretyakov,
                R.string.descr_museum_tretyakov, R.drawable.museum_tretyakov));
        places.add(new Place(R.string.title_museum_pushkin, R.string.address_museum_pushkin,
                R.string.descr_museum_pushkin, R.drawable.museum_pushkin));
        places.add(new Place(R.string.title_museum_palata, R.string.address_museum_palata,
                R.string.descr_museum_palata, R.drawable.museum_oruz));
        places.add(new Place(R.string.title_museum_fond, R.string.address_museum_fond,
                R.string.descr_museum_fond, R.drawable.museum_almaz));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            }
        });

        return rootView;
    }
}
