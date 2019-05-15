package com.stackroute.pe3;

import org.junit.Test;

public class ExceptionCheckTest {

    ExceptionCheck obj=new ExceptionCheck();


    @Test(expected = NullPointerException.class)
    public void ChkNullPointerException() throws Exception
    {
        int[] arr=null;
        obj.CheckArraySize(arr);

    }

    @Test(expected = NegativeArraySizeException.class)
    public void ChkNegativeArraySizeException() throws Exception
    {
        int[] arr=new int[-2];

        obj.CheckArraySize(arr);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void IndexOutOfBoundsException() throws Exception
    {
        int[] arr=new int[0];
        obj.CheckArraySize(arr);
    }
}
