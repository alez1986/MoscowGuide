package com.example.android.moscowguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;


public class ClubFragment extends Fragment {

    public ClubFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.title_club_mono, R.string.address_club_mono,
                R.string.descr_club_mono, R.drawable.club_mono));
        places.add(new Place(R.string.title_club_cs, R.string.address_club_cs,
                R.string.descr_club_cs, R.drawable.club_cs));
        places.add(new Place(R.string.title_club_bar19, R.string.address_club_bar19,
                R.string.descr_club_bar19, R.drawable.club_bar19));
        places.add(new Place(R.string.title_club_mart, R.string.address_club_mart,
                R.string.descr_club_mart, R.drawable.club_mart));

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
