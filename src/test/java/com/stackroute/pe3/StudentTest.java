package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class StudentTest {

    StudentMarks std=new StudentMarks();

    int[] arr={45,-8,126};

    @Test
        public void CheckInputGrades()
        {
           String[] ExpectedResult={"true","Input is less than lowest value, enter a valid input","Input is greater than highest value, enter a valid input"};
           String[] Result=std.fun(arr);
           assertArrayEquals(ExpectedResult,Result);
        }

}
