package com.example.locationhelper;

import android.location.Location;

public class LocationHelper {
    public  static  float getDistanceInRM(double startLatitude,double startLonggitude,double endLatitude,double endLongitude){
        float[] result =new float[0];
        Location.distanceBetween(startLatitude,startLonggitude,endLatitude,endLongitude,result);
        return result[0]/1000;
    }

}

