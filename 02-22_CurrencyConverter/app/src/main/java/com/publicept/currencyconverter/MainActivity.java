package com.publicept.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        Log.i("Info", "Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);

        String amountInDollar = editText.getText().toString();

        double amountInDollarDouble = Double.parseDouble(amountInDollar);

        double amountInChfDouble = amountInDollarDouble * 0.96;

        // convert String rounded to 2 decimal places
        String amountInChf = String.format("%.2f", amountInChfDouble);

        Log.i("Amount in CHF", amountInChf.toString());
        Toast.makeText(this, "$" + amountInDollar + " is CHF" + amountInChf, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}