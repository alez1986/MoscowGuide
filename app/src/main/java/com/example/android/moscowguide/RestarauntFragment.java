package com.example.android.moscowguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class RestarauntFragment extends Fragment {

    public RestarauntFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.title_rest_propaganda, R.string.address_rest_propaganda,
                R.string.descr_rest_propaganda, R.drawable.rest_propaganda));
        places.add(new Place(R.string.title_rest_rabbit, R.string.address_rest_rabbit,
                R.string.descr_rest_rabbit, R.drawable.rest_white_rabbit));
        places.add(new Place(R.string.title_rest_moloko, R.string.address_rest_moloko,
                R.string.descr_rest_moloko, R.drawable.rest_moloko));
        places.add(new Place(R.string.title_rest_kvartira, R.string.address_rest_kvartira,
                R.string.descr_rest_kvartira, R.drawable.rest_flat44));
        places.add(new Place(R.string.title_rest_schastie, R.string.address_rest_schastie,
                R.string.descr_rest_schastie, R.drawable.rest_schastie));
        places.add(new Place(R.string.title_rest_grabli, R.string.address_rest_grabli,
                R.string.descr_rest_grabli, R.drawable.rest_grabli));

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

