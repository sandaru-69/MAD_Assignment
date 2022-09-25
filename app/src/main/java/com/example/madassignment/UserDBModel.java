package com.example.madassignment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.madassignment.UserDBSchema.userTable;

import java.util.ArrayList;

public class UserDBModel
{
    SQLiteDatabase db;

    public void load(Context context)
    {
        this.db = new UserDBHelper(context).getWritableDatabase();
    }

    public void addUser(User user)
    {
        ContentValues cv = new ContentValues();
        cv.put(userTable.Cols.USER_NAME, user.getUserName());
        cv.put(userTable.Cols.PASSWORD, user.getPassword());
        db.insert(userTable.NAME, null, cv);
    }

    public ArrayList<User> getAllUser()
    {
        ArrayList<User> userList = new ArrayList<>();
        Cursor cursor = db.query(userTable.NAME,null,null,null,null,null,null);
        UserDBCursor userDBCursor = new UserDBCursor(cursor);

        try
        {
            userDBCursor.moveToFirst();
            while(!userDBCursor.isAfterLast())
            {
                userList.add(userDBCursor.getUser());
                userDBCursor.moveToNext();
            }
        }
        finally
        {
            cursor.close();
        }
        return userList;
    }
}
