package com.stackroute.pe3;

import java.util.Arrays;

public class JoinAndMerge {
    public String CompareElements(String[] x,String[] y) {

        boolean status=false;
        String result;

        if (x.length == y.length) {

            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < y.length; j++) {            //comparing elements
                    if (x[i] == y[j]) {
                        status = true;
                        break;
                    }
                    else
                    {
                        status=false;
                    }
                }


            }
        }
        if(status==true)
            return result="Equal";
        else
            return result="Not Equal";

    }
    public String[] RemDuplicates(String[] arr)             //removing duplicates
    {
        int size=arr.length;

        for (int i=0;i<size;i++)
        {
            for (int j=i+1;j<size;j++)
            {
                if (arr[i]==arr[j])
                {
                    arr[j]=arr[size-1];
                    size--;
                    j--;
                }
            }
        }
        String[] temp= Arrays.copyOf(arr,size);
        return temp;
    }

    public String[] appendArrays(String[] x,String[] y)             //to append first element of second array to first array
    {
        int i;
        int j=0;
        String[] result=new String[y.length+1];
        for(i=0;i<y.length;i++){
            result[j]=y[i];
            j++;
        }
        result[result.length-1]=x[0];
        return result;
    }
    public String[] prependArrays(String[] x,String[] y)                // to prepend mid element of first array to second array
    {
        int i;
        int j=1;
        int mid=y.length/2;
        String[] result=new String[x.length+1];
       result[0]=y[mid];
       for (i=0;i<x.length;i++)
       {
           result[j]=x[i];
           j++;
       }
        return result;
    }
}
