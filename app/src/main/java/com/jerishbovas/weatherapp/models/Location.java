package com.jerishbovas.weatherapp.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "locations")
public class Location {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    public int key;

    public String cityName;

    public boolean isCurrent;
}
