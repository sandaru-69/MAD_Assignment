package com.example.madassignment;

//defines the structure of the database which stores the user details
// (userName and password for each user).

public class UserDBSchema
{
    public static class userTable
    {
        public static final String NAME = "users"; //The table name set to constant
        public static class Cols //The table columns and the respective data types
        {
            public static final String USER_NAME = "userName";
            public static final String PASSWORD = "password";
        }
    }
}
