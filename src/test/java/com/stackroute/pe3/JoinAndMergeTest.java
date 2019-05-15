package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class JoinAndMergeTest {

    JoinAndMerge jm=new JoinAndMerge();
    String[] array1={"abc"};
    String[] array2={"def","def","jkl"};
    String[] array3={"pqr","stu","xyz"};

    @Test
    public void CompareIfOneOfStringsIsNullOrWithDiffLengthTest(){

        String result=jm.CompareElements(array1,array3);
        assertEquals("Not Equal",result);

    }
    @Test
    public void CompareElementsTest()
    {

        String result=jm.CompareElements(array2,array3);
        assertEquals("Equal",result);

    }
    @Test
    public void RemDuplicatesTest()
    {
        String[] ExpectedResult={"def","jkl"};
        String[] Result=jm.RemDuplicates(array2);
        assertArrayEquals(ExpectedResult,Result);

    }
    @Test
    public void appendArraysTest()
    {
        String[] ExpectedResult={"pqr","stu","xyz","def"};
        String[] Result=jm.appendArrays(array2,array3);
        assertArrayEquals(ExpectedResult,Result);
    }
    @Test
    public void prependArraysTest()
    {
        String[] ExpectedResult={"stu","def","def","jkl"};
        String[] Result=jm.prependArrays(array2,array3);
        assertArrayEquals(ExpectedResult,Result);
    }
}
