package com.example.admin.pumpkin;

import com.j256.ormlite.field.DatabaseField;

/**
 * Created by java-3-02 on 01.02.2017.
 */
public class User {
    @DatabaseField(ganeratedID = true)
    public int UserID = 0;
    @DatabaseField(canBeNull = false)
    public int id = 0;
    @DatabaseField(canBeNull = false)
    public String name = "";
    @DatabaseField(canBeNull = false)
    public int age = 0;
}

