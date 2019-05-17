package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class PlacesTest {
    Places p;
    String[] countries={"India","UAE","a",""};

    @Before
    public void setUp()
    {
        //arrange
        p=new Places();

        System.out.println("Inside Before");

    }
    @Test
    public void checkIfMoreThanOneVowel(){
        String[] Expected={"nd","","","Input string cannot be null"};
        String[] Result=p.remVowels(countries);
        assertArrayEquals(Expected,Result);
    }
    @Test
    public void checkIfAllAreVowel(){
        String[] Expected={"nd","","","Input string cannot be null"};
        String[] Result=p.remVowels(countries);
        assertArrayEquals(Expected,Result);
    }
    @Test
    public void checkIfNull(){
        String[] Expected={"nd","","","Input string cannot be null"};
        String[] Result=p.remVowels(countries);
        assertArrayEquals(Expected,Result);
    }
    @After
    public void tearDown()
    {
        //arrange
        p=null;

        System.out.println("Inside After");

    }
}
