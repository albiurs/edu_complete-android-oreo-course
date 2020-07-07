package com.publicept.a03_39_numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Initiate Number Test
     * @param view
     */
    public void initTest(View view) {

        Log.i("Info", "button pressed");

        // == fields ==
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        NumberTest numberTest = new NumberTest();

        numberTest.testNumber(editText);

        Toast.makeText(this, numberTest.getMessage(), Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}