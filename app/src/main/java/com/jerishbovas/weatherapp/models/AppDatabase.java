package com.jerishbovas.weatherapp.models;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {City.class, Location.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CityDao cityDao();
    public abstract LocationDao locationDao();
}
