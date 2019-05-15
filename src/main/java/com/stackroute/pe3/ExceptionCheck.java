package com.stackroute.pe3;

public class ExceptionCheck {


    public void CheckArraySize(int[] arr) throws Exception {

        if (arr == null) {

            throw new NullPointerException("Array having null size");
        }

        if (arr.length < 0) {

            throw new NegativeArraySizeException("");
        }

        if (arr[arr.length]==0) {
            throw new IndexOutOfBoundsException("Array having out of bound size");

        }
    }
}