package com.example.guest.weatherclass;

/**
 * Created by Guest on 11/29/16.
 */
public class Constants {
    public static final String Weather_Token_Key = BuildConfig.Weather_Token_Key;
    public static final String API_BASE_URL = "http://api.openweathermap.org/data/2.5/weather?";
    public static final String YOUR_QUERY_PARAMETER = "zip"; //Example: "location"
    public static final String API_KEY_QUERY_PARAMETER = "appid";
    public static final String API_KEY_UNITS_PARAMETER = "units";
    public static final String API_BASE_FORCAST_URL = "http://api.openweathermap.org/data/2.5/forecast/daily?";
    public static final String FORCAST_QUERY_PARAMETER = "q";
    public static final String API_KEY_DAILY_PARAMETER = "cnt";
}

