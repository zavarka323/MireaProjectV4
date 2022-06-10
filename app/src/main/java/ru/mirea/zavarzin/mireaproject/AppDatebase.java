package ru.mirea.zavarzin.mireaproject;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Owner.class}, version = 2)
public abstract class AppDatebase extends RoomDatabase{
    public abstract OwnerDao ownerDao();
}
