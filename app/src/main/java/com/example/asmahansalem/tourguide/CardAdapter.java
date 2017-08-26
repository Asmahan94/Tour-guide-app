package com.example.asmahansalem.tourguide;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Asmahan Salem on 8/20/2017.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    /**
     * Here is a Java code source that helped me in how to write code for the RecyclerView & adapter
     * <p>
     * file name: Home  http://wsdesign.in/home/detail/4#
     * I made this adapter from the code link above.
     **/


    private ArrayList<FeedProperties> dataSet;

    public CardAdapter(ArrayList<FeedProperties> os_versions) {


        dataSet = os_versions;
    }

    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.item_list, null);

        // create ViewHolder
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardAdapter.ViewHolder viewHolder, int i) {

        FeedProperties fp = dataSet.get(i);

        viewHolder.ItemName.setText(fp.getTitle());
        viewHolder.details.setText(fp.getDetails());
        viewHolder.iconView.setImageResource(fp.getThumbnail());
        viewHolder.iconView.setBackgroundResource(fp.getThumbnail());

        viewHolder.feed = fp;

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView ItemName;
        public TextView details;
        public ImageView iconView;
        public FeedProperties feed;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            ItemName = (TextView) itemLayoutView
                    .findViewById(R.id.name);
            iconView = (ImageView) itemLayoutView
                    .findViewById(R.id.location_image);
            details = (TextView) itemLayoutView.findViewById(R.id.description);

        }
    }
}