package com.example.asmahansalem.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Asmahan Salem on 8/20/2017.
 */

public class PagerAdapter1 extends FragmentStatePagerAdapter {

    /**
     * Here is a Java code source that helped me in how to write code for the View pager
     * <p>
     * link:  http://wsdesign.in//home/detail/59
     * <p>
     * I made this code from the code link above
     **/

    int mNumOfTabs;

    public PagerAdapter1(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new ResturantFragment();
            case 1:
                return new MallFragment();

            case 2:
                return new HotelFragment();
            case 3:
                return new HistoricalFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}