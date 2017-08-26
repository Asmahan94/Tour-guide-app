package com.example.asmahansalem.tourguide;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by Asmahan Salem on 8/25/2017.
 */

public class HotelFragment extends Fragment {

    /**
     * Here is a Java code source that helped me in how to write code for the RecyclerView & adapter
     * <p>
     * file name: Home, link:  http://wsdesign.in/home/detail/4#
     * <p>
     * I made this code from the code link above
     **/
    private RecyclerView recyclerView;
    private ArrayList<FeedProperties> os_versions;
    private CardAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragmenttab3, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.list_Resturant);
        final String[] versions = {getString(R.string.Hotel1), getString(R.string.Hotel2), getString(R.string.Hotel3), getString(R.string.Hotel4)};
        final String[] details = {getString(R.string.Location_Hotel1), getString(R.string.Location_Hotel2), getString(R.string.Location_Hotel3), getString(R.string.Location_Hotel4)};

        final int[] icons = {R.drawable.hotel1, R.drawable.hotel2, R.drawable.hotel3, R.drawable.hotel4};
        os_versions = new ArrayList<FeedProperties>();
        for (int i = 0; i < versions.length; i++) {
            FeedProperties feed = new FeedProperties();

            feed.setTitle(versions[i]);
            feed.setDetails(details[i]);
            feed.setThumbnail(icons[i]);
            os_versions.add(feed);
        }

        recyclerView.setHasFixedSize(true);
        //Grid View
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2, 1, false));
        // create an Object for Adapter
        mAdapter = new CardAdapter(os_versions);
        // set the adapter object to the Recyclerview
        recyclerView.setAdapter(mAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1, 1, false);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            gridLayoutManager.setOrientation(LinearLayout.VERTICAL);
        } else {
            gridLayoutManager.setOrientation(LinearLayout.VERTICAL);
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }

}