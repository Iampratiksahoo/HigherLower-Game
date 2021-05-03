package com.example.higherandlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    int randomNumber;

    public void generateRandomNumber()
    {

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }

    public void click_event(View view)
    {
        Log.i("Information", "Button Clicked");
        EditText userInputText = (EditText) findViewById(R.id.userInputText);
        String message = "Start";


        int userNumber = Integer.parseInt(userInputText.getText().toString());

        if(userNumber > randomNumber)
        {
            message = "Lower";
        }
        else if(userNumber < randomNumber)
        {
            message = "Higher";
        }
        else if(userNumber == randomNumber)
        {
            message = "Hurrah! That's the number";
            generateRandomNumber();
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();
    }
}