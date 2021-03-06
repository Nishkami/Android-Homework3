package com.example.android.homework.roomdatabase;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.android.homework.NewsItem;

import java.util.List;


@Dao
public interface NewsItemDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(List<NewsItem> newsItem);

    @Query("SELECT * FROM news_item")
    List<NewsItem> loadAllNews();

    @Query("DELETE FROM news_item")
    void clearrAll();


}
