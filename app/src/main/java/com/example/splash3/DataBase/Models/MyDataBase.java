package com.example.splash3.DataBase.Models;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.splash3.DataBase.Models.DAOs.NotsDao;
import com.example.splash3.DataBase.Models.Models.Note;

@Database(entities = Note.class,version = 1,exportSchema = false)
public  abstract class MyDataBase extends RoomDatabase {

    private static MyDataBase myDataBase;
    private static final String db_name="NoteDataBase";
    public abstract NotsDao notsDao();
    private MyDataBase(){

    }

    public static MyDataBase getInstance(Context context){
        if(myDataBase==null){
         myDataBase= Room.databaseBuilder(context,MyDataBase.class,db_name)
                 .fallbackToDestructiveMigration()
                 .allowMainThreadQueries()
                 .build();
        }
        return myDataBase;

    }
}
