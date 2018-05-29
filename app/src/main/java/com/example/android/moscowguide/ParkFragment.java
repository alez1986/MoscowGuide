package com.example.android.moscowguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class ParkFragment extends Fragment {

    public ParkFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.title_park_kultury, R.string.address_park_kultury,
                R.string.descr_park_kultury, R.drawable.park_kultury));
        places.add(new Place(R.string.title_park_museon, R.string.address_park_museon,
                R.string.descr_park_museon, R.drawable.park_museon));
        places.add(new Place(R.string.title_park_vdnh, R.string.address_park_vdnh,
                R.string.descr_park_vdnh, R.drawable.park_vdnh));
        places.add(new Place(R.string.title_park_ogorod, R.string.address_park_ogorod,
                R.string.descr_park_ogorod, R.drawable.park_ogorod));
        places.add(new Place(R.string.title_park_pobedy, R.string.address_park_pobedy,
                R.string.descr_park_pobedy, R.drawable.park_pobedy));
        places.add(new Place(R.string.title_park_zaryadie, R.string.address_park_zaryadie,
                R.string.descr_park_zaryadie, R.drawable.park_zaryadie));

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

