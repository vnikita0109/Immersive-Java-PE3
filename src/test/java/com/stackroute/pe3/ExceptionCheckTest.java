package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExceptionCheckTest {

    ExceptionCheck obj;

    @Before
    public void SetUp()
    {
        //arrange
       obj= new ExceptionCheck();
    }

    @Test(expected = NullPointerException.class)
    public void chkNullPointerException() throws Exception
    {
        int[] arr=null;
        obj.CheckArraySize(arr);

    }

    @Test(expected = NegativeArraySizeException.class)
    public void chkNegativeArraySizeException() throws Exception
    {
        int[] arr=new int[-2];

        obj.CheckArraySize(arr);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void indexOutOfBoundsException() throws Exception
    {
        int[] arr=new int[0];
        obj.CheckArraySize(arr);
    }
    @After
    public void tearDown()
    {
        //arrange
        obj= null;
    }
}
