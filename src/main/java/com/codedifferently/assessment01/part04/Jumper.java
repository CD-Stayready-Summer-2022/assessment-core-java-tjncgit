package com.codedifferently.assessment01.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
        int min = flagHeight/jumpHeight;
        int remainder = flagHeight%jumpHeight;

        return min + remainder;
    }
}
