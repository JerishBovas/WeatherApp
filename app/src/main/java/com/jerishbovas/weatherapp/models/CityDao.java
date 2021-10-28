package com.jerishbovas.weatherapp.models;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CityDao {

    @Insert
    void insertAll(City... cities);

    @Delete
    void delete(City city);

    @Query("SELECT * FROM cities")
    List<City> getAllName();

    @Query("SELECT * FROM cities WHERE uid = :id")
    City getById(int id);

    @Query("SELECT * FROM cities WHERE cityName LIKE :name")
    List<City> getAllByName(String name);
}
