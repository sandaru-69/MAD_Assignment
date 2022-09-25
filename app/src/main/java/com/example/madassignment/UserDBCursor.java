package com.example.madassignment;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.madassignment.UserDBSchema.userTable;

public class UserDBCursor extends CursorWrapper
{
    public UserDBCursor(Cursor cursor)
    {
        super(cursor);
    }

    public User getUser()
    {
        String userName = getString(getColumnIndex(userTable.Cols.USER_NAME));
        String password = getString(getColumnIndex(userTable.Cols.PASSWORD));
        return new User(userName,password);
    }
}


