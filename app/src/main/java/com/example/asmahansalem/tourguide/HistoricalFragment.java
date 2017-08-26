package com.example.asmahansalem.tourguide;

/**
 * Created by Asmahan Salem on 8/25/2017.
 */

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by Asmahan Salem on 8/20/2017.
 */
public class HistoricalFragment extends Fragment {

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

        View rootView = inflater.inflate(R.layout.fragmenttab4, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.list_Resturant);

        final String[] versions = {getString(R.string.Historcal1), getString(R.string.Historcal2), getString(R.string.Historcal3), getString(R.string.Historcal4), getString(R.string.Historcal5)};
        final String[] details = {getString(R.string.Location_Historcal1), getString(R.string.Location_Historcal2), getString(R.string.Location_Historcal3), getString(R.string.Location_Historcal4), getString(R.string.Location_Historcal5)};

        final int[] icons = {R.drawable.historical1, R.drawable.historical2, R.drawable.historical3, R.drawable.historical4, R.drawable.historical5};


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
