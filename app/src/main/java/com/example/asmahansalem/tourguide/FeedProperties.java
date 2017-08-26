package com.example.asmahansalem.tourguide;

/**
 * Created by Asmahan Salem on 8/20/2017.
 */

public class FeedProperties {

    /**
     * Here is a Java code source that helped me in how to write code for the RecyclerView & adapter
     * <p>
     * file name: Home  http://wsdesign.in/home/detail/4#
     * <p>
     * this code use to get data & set data of title and details.
     **/

    private String title;
    private String details;
    private int thumbnail;

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public void setTitle(String title)

    {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getThumbnail() {

        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {

        this.thumbnail = thumbnail;
    }
}
