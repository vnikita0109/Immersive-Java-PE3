package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class IdentifyAndReverseNumTest {

    IdentifyAndReverseNum obj=new IdentifyAndReverseNum();
    int[] arr={2,15,22,23,38};
@Test
    public void CheckElementIsEvenOddTest()
{

    String ExpectedResult[]={"Even","Odd","Even","Odd","Even"};
    String Result[]=obj.EvenOdd(arr);
    assertArrayEquals(ExpectedResult,Result);

}
@Test
    public void EliminatePrimeElementsTest()
{
    int ExpectedResult[]={15,22,38};
    int Result[]=obj.Prime(arr);
    assertArrayEquals(ExpectedResult,Result);
}
@Test
    public void ReverseElementTest()
{
    int ExpectedResult[]={38,23,22,15,2};
    int Result[]=obj.ReverseNum(arr);
    assertArrayEquals(ExpectedResult,Result);
}

}