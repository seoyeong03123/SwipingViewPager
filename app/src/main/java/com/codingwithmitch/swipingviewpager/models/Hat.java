package com.codingwithmitch.swipingviewpager.models;

import android.os.Parcel;
import android.os.Parcelable;


public class Hat implements Parcelable {

/*    private String title, subtitle;*/
    private int image;

    public Hat(int image) {
/*        this.title = title;
        this.subtitle = subtitle;*/
        this.image = image;
    }

    public Hat(Hat product) {
/*        this.title = product.title;
        this.subtitle = product.subtitle;*/
        this.image = product.image;
    }


    protected Hat(Parcel in) {
/*        title = in.readString();*/
        image = in.readInt();
    }

    public static final Creator<Hat> CREATOR = new Creator<Hat>() {
        @Override
        public Hat createFromParcel(Parcel in) {
            return new Hat(in);
        }

        @Override
        public Hat[] newArray(int size) {
            return new Hat[size];
        }
    };


/*
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
*/

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
/*        dest.writeString(title);*/
        dest.writeInt(image);
    }
}