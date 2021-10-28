package com.jerishbovas.weatherapp.models;

import android.content.Context;

import androidx.room.Room;

public class AppDatabaseAccess {

    private static AppDatabase db = null;

    public static AppDatabase getDb(Context context){
        if(db == null){
            db = Room.databaseBuilder(context, AppDatabase.class, "weatherdb").build();
        }
        return db;
    }
}
