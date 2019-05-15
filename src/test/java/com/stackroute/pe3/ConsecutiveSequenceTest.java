package com.stackroute.pe3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConsecutiveSequenceTest {
    ConsecutiveSequence cs=new ConsecutiveSequence();

    @Test
    public void CheckConsecutiveForNCTest()
    {
        String arr="98,96,95,94,93";
        String Expected="Non-consecutive numbers";
        String Result=cs.Consecutive(arr);
        assertEquals(Expected,Result);

    }
    @Test
    public void ChkConsecutiveForCTest()
    {
        String arr="54,53,52,51,50,49,48";
        String Expected="Consecutive numbers";
        String Result=cs.Consecutive(arr);
        assertEquals(Expected,Result);
    }
    @Test
    public void ChkConsecutiveForSameNumSeqTest()
    {
        String arr="6,6,6,6,6,6";
        String Expected="Non-consecutive numbers";
        String Result=cs.Consecutive(arr);
        assertEquals(Expected,Result);
    }
    @Test
    public void ChkConsecutiveForNegNumTest()
    {
        String arr="0,-1.-2,-3,-4,-5";
        String Expected="Consecutive numbers";
        String Result=cs.Consecutive(arr);
        assertEquals(Expected,Result);
    }
}
