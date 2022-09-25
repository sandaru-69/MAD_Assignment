package com.example.madassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    private ArrayList<User> userList;
    private boolean athenticate = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserDBModel userDBModel = new UserDBModel(); //NEW ***********
        userDBModel.load(getApplicationContext()); //NEW ***********


        //User user1 = new User("test","test123"); //DELETE ***********DELETE ***********DELETE ***********DELETE ***********
        //userDBModel.addUser(user1); //DELETE ***********DELETE ***********DELETE ***********DELETE ***********

        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                EditText emailInput = (EditText) findViewById(R.id.editTextTextEmailAddress);
                emailInput  = (EditText) findViewById(R.id.editTextTextEmailAddress);
                EditText passwordInput = (EditText) findViewById(R.id.editTextTextPassword);
                passwordInput  = (EditText) findViewById(R.id.editTextTextPassword);

                userList = userDBModel.getAllUser();
                for (User user: userList)
                {
                    if (((user.getUserName()).equals(emailInput.getText().toString())) && ((user.getPassword()).equals(passwordInput.getText().toString()))) //checking if user email and pass is found in the DB
                    {
                        athenticate = true;
                    }

                    if (athenticate == true) //IF the user email and respective is found in the DB
                    {

                        Intent intent = new Intent(getApplicationContext(), ProceedToOrder.class);
                        startActivity(intent);

                    } else //IF the user email and respective password NOT is found in the DB
                    {
                        Snackbar.make(findViewById(android.R.id.content), "Email or Password invalid, Please Register", Snackbar.LENGTH_SHORT).show();
                    }
                }
            }
        });
        Button registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                EditText emailInput = (EditText) findViewById(R.id.editTextTextEmailAddress);
                emailInput  = (EditText) findViewById(R.id.editTextTextEmailAddress);
                EditText passwordInput = (EditText) findViewById(R.id.editTextTextPassword);
                passwordInput  = (EditText) findViewById(R.id.editTextTextPassword);

                userList = userDBModel.getAllUser();
                for (User user: userList) //Checking is user Already registered
                {
                    if (((user.getUserName()).equals(emailInput.getText().toString())) && ((user.getPassword()).equals(passwordInput.getText().toString()))) //checking if user email and pass is found in the DB
                    {
                        athenticate = true;
                        Snackbar.make(findViewById(android.R.id.content), "User Already Registered, PLease Login", Snackbar.LENGTH_SHORT).show();
                    }
                }
                if (athenticate == false)
                {
                    User user1 = new User(emailInput.getText().toString(),passwordInput.getText().toString());
                    userDBModel.addUser(user1);
                    Snackbar.make(findViewById(android.R.id.content), "Successfully Registered", Snackbar.LENGTH_SHORT).show();
                }
            }
        });

        Button buttonProceed = (Button) findViewById(R.id.button_proceed);
        buttonProceed.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(), ProceedToOrder.class);
                startActivity(intent);
            }
        });


    }
}