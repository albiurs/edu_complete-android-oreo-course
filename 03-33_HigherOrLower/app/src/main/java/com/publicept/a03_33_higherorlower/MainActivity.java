package com.publicept.a03_33_higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // == fields ==
    private int randomNumber;
    private String message;



    // == public methods ==
    /**
     * Processing guess
     * @param view
     */
    public void onGuessButtonClick(View view) {
        Log.i("Info", "Button pressed!");

        // get text from the EditText form field
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        Log.i("Entered Value", editText.getText().toString());
        int guessValue = Integer.parseInt(editText.getText().toString());
        
        // update message dependent on the guess
        if(guessValue > randomNumber) {
            message = "Lower!";
        } else if(guessValue < randomNumber){
            message = "Higher!";
        } else {
            message = "You guessed it! Try again...";
            generateRandomNumber(); // re-generate new random number
        }

        // guess-dependent Toast output
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


    /**
     * Generate a random number
     */
    public void generateRandomNumber() {
        // create a random number
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
        Log.i("Random Number", Integer.toString(randomNumber));
    }



    // == onCreate ==
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a random number
        generateRandomNumber();
    }
}