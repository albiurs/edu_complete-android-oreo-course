package com.publicept.a03_39_numbershapes;

import android.widget.EditText;

public class NumberTest {

    private String message;
    Number myNumber = new Number();


    /**
     * Run the number test and generate the output message
     * @param editText  the EditText object containing the input value
     */
    public void testNumber(EditText editText) {

        if (editText.getText().toString().isEmpty()) {

            message = "Please enter a number";

        } else {

            myNumber.setNumber(Integer.parseInt(editText.getText().toString()));

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
    }



    // == getter & setter ==

    /**
     * getMessage()
     * @return  message generated
     */
    public String getMessage() {
        return message;
    }
}
