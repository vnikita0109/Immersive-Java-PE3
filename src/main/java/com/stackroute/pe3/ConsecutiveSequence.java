package com.stackroute.pe3;

import java.util.Arrays;

public class ConsecutiveSequence {

    public String Consecutive(String str)
    {

        String[] numbers = str.split(",");
        int length;
        length=numbers.length;
        int[] num=new int[length];

        for (int i=0;i<length;i++){
            num[i]=Integer.parseInt(numbers[i]);  //to examine each integer
        }

        Arrays.sort(num);                           //sorting the sequence of integers
        String flag="Consecutive";
        for (int x=0;x<num.length-1;x++)
        {
            if ((num[x]-1)==num[x+1]){
                flag="Consecutive numbers";
                break;
            }
            else {
                flag="Non-consecutive numbers";
            }
        }

        return flag;
    }
}
