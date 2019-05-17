package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class StudentTest {

    StudentMarks std;

    int[] arr={45,-8,126};
    @Before
    public void setUp()
    {
        //arrange
       std=new StudentMarks();

        System.out.println("Inside Before");

    }


    @Test
        public void checkInputGrades()
        {
           String[] ExpectedResult={"true","Input is less than lowest value, enter a valid input","Input is greater than highest value, enter a valid input"};
           String[] Result=std.fun(arr);
           assertArrayEquals(ExpectedResult,Result);
        }

    @After
    public void tearDown()
    {
        //arrange
        std=null;

        System.out.println("Inside After");

    }

}
