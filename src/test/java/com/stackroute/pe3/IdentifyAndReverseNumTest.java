package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentifyAndReverseNumTest {

    IdentifyAndReverseNum obj;
    int[] arr={2,15,22,23,38};

    @Before
    public void setUp()
    {
        //arrange
        obj=new IdentifyAndReverseNum();

        System.out.println("Inside Before");

    }

@Test
    public void checkElementIsEvenOddTest()
{

    String ExpectedResult[]={"Even","Odd","Even","Odd","Even"};
    String Result[]=obj.EvenOdd(arr);
    assertArrayEquals(ExpectedResult,Result);

}
@Test
    public void eliminatePrimeElementsTest()
{
    int ExpectedResult[]={15,22,38};
    int Result[]=obj.Prime(arr);
    assertArrayEquals(ExpectedResult,Result);
}
@Test
    public void reverseElementTest()
{
    int ExpectedResult[]={38,23,22,15,2};
    int Result[]=obj.ReverseNum(arr);
    assertArrayEquals(ExpectedResult,Result);
}
    @After
    public void tearDown()
    {
        //arrange
        obj=null;

        System.out.println("Inside After");

    }

}