package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConsecutiveSequenceTest {
    ConsecutiveSequence cs;

    @Before
    public void setUp()
    {
        //arrange
        cs= new ConsecutiveSequence();

        System.out.println("Inside Before");

    }
    @Test
    public void checkConsecutiveForNCTest()
    {
        String arr="98,96,95,94,93";
        String Expected="Non-consecutive numbers";
        String Result=cs.Consecutive(arr);
        assertEquals(Expected,Result);

    }
    @Test
    public void chkConsecutiveForCTest()
    {
        String arr="54,53,52,51,50,49,48";
        String Expected="Consecutive numbers";
        String Result=cs.Consecutive(arr);
        assertEquals(Expected,Result);
    }
    @Test
    public void chkConsecutiveForSameNumSeqTest()
    {
        String arr="6,6,6,6,6,6";
        String Expected="Non-consecutive numbers";
        String Result=cs.Consecutive(arr);
        assertEquals(Expected,Result);
    }
    @Test
    public void chkConsecutiveForNegNumTest()
    {
        String arr="0,-1.-2,-3,-4,-5";
        String Expected="Consecutive numbers";
        String Result=cs.Consecutive(arr);
        assertEquals(Expected,Result);
    }
    @After
    public void tearDown()
    {
        //arrange
        cs=null;

        System.out.println("Inside After");

    }
}
