package ru.mirea.zavarzin.mireaproject;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Owner {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public String university;
    public String name;
    public String age;
}
