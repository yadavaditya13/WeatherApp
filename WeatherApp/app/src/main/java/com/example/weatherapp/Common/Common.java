package com.example.weatherapp.Common;

import org.jetbrains.annotations.NotNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static String API_KEY = "2113f6b8025d46324748f081f6c10e38";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    @NotNull
    public static String apiRequest(String lat, String lng) {
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric", lat, lng, API_KEY));
        return sb.toString();
    }

    public static String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon){
        return String.format("http://openweathermap.org/img/w/%s.png", icon);
    }

    public static  String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }


}
