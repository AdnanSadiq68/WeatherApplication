package com.adnansadiq.weatherapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI {

    // we will get the data by location and city name
    @GET("weather?lat=20.0102989&lon=64.4294212&appid=ce90b79c5083ed59db29af1ca27b52ad&units=metric")
    Call<WeatherMap>getWeatherWithLocation(@Query("lat") double lat, @Query("lon") double lon);


    // similar to the according to the city name

    @GET("weather?appid=ce90b79c5083ed59db29af1ca27b52ad&units=metric")
    Call<WeatherMap>getWeatherWithCityName(@Query("q") String name);

}
