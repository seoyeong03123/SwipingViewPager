package com.codingwithmitch.swipingviewpager.resources;

import com.codingwithmitch.swipingviewpager.R;
import com.codingwithmitch.swipingviewpager.models.Hat;

import java.math.BigDecimal;

public class Hats {

    public static Hat[] getHats(){
        return SNAPBACKS;
    }

/*    public static final Hat SAMPLE1 = new Hat("title1", "subtitle1", R.drawable.snapback_black);
    public static final Hat SAMPLE2 = new Hat("title2","subtitle2", R.drawable.snapback_camo);
    public static final Hat SAMPLE3 = new Hat("title3", "subtitle3", R.drawable.snapback_grey);
    public static final Hat SAMPLE4 = new Hat("title4", "subtitle4", R.drawable.snapback_navy);
    public static final Hat SAMPLE5 = new Hat("title5", "subtitle5", R.drawable.snapback_red);
    public static final Hat SAMPLE6 = new Hat("title6", "subtitle6", R.drawable.snapback_teal);*/
    public static final Hat SAMPLE1 = new Hat(R.drawable.snapback_black);
    public static final Hat SAMPLE2 = new Hat(R.drawable.snapback_camo);
    public static final Hat SAMPLE3 = new Hat(R.drawable.snapback_grey);
    public static final Hat SAMPLE4 = new Hat(R.drawable.snapback_navy);
    public static final Hat SAMPLE5 = new Hat(R.drawable.snapback_red);
    public static final Hat SAMPLE6 = new Hat(R.drawable.snapback_teal);

    public static final Hat[] SNAPBACKS = {SAMPLE1, SAMPLE2, SAMPLE3, SAMPLE4, SAMPLE5, SAMPLE6};



}