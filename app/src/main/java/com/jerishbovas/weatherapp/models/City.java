package com.jerishbovas.weatherapp.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "cities")
public class City {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    public String cityName;

    public int key;

    public String region;

    public String country;

    public String administrativeArea;
}
