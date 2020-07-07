package com.publicept.a03_39_numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void testNumber(View view) {

        Log.i("Info", "button pressed");

        EditText editText = (EditText) findViewById(R.id.editTextNumber);

        String message;

        if (editText.getText().toString().isEmpty()) {

            message = "Please enter a number";

        } else {

            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(editText.getText().toString());

            message = editText.getText().toString();

            if (myNumber.isSquare() && myNumber.isTriangular()) {

                message += " is square and triangular!";

            } else if (myNumber.isSquare()) {

                message += " is square but not triangular.";

            } else if (myNumber.isTriangular()) {

                message += " is triangular but not square.";

            } else {

                message += " is neither triangular nor square.";

            }

        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}