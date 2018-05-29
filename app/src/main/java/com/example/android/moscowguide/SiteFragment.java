package com.example.android.moscowguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class SiteFragment extends Fragment {

    public SiteFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.title_site_bagration, R.string.address_site_bagration,
                R.string.descr_site_bagration, R.drawable.site_bagration));
        places.add(new Place(R.string.title_site_square, R.string.address_site_square,
                R.string.descr_site_square, R.drawable.site_red_square));
        places.add(new Place(R.string.title_site_mgu, R.string.address_site_mgu,
                R.string.descr_site_mgu, R.drawable.site_vorob));
        places.add(new Place(R.string.title_site_kanal, R.string.address_site_kanal,
                R.string.descr_site_kanal, R.drawable.site_greb));

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

