package com.publicept.a03_39_numbershapes;

public class Number {

    private int number;


    // == public methods ==
    /**
     * Tests if the number is a square number
     * @return  true/false
     */
    public boolean isSquare() {

        double squareRoot = Math.sqrt(number);

        if (squareRoot == Math.floor(squareRoot)) {

            return true;
        } else {

            return false;

        }

    }

    /**
     * Tests if the number is a triangular number
     * @return true/false
     */
    public boolean isTriangular() {

        int x = 1;

        int triangularNumber = 1;

        while (triangularNumber < number) {

            x++;
            triangularNumber = triangularNumber + x;
        }

        if (triangularNumber == number) {
            return true;
        } else {
            return false;
        }

    }



    // == getter & setter
    /**
     * Set the number field
     * @param number the int to set the number
     */
    public void setNumber(int number) {
        this.number = number;
    }
}
