package com.example.splash3.DataBase.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.splash3.DataBase.Models.Models.Note;

import java.util.List;

@Dao
public  interface NotsDao {
    @Insert
    void addNote(Note note);
    @Delete
    void deleteNot(Note note);
    @Query("delete from Note where id=:id")
    void deleteNote(int id);
    //search by name in note
    @Query("select * from Note where title=:title")
    Note searchNoteByTitle(String title);
    @Query("select * from Note")
    List<Note> getAllNote();
    @Update
    void update(Note note);

}
