package com.stackroute.pe3;

public class IdentifyAndReverseNum {

    public String[] EvenOdd(int[] num)
    {
        String[] result=new String[num.length];
        for(int i=0;i<num.length;i++) {                     //check if number is even or odd
            if (num[i] % 2 == 0)
               result[i]="Even";
            else
                result[i]="Odd";
        }
        return result;
    }
    public int[] Prime(int[] num){

        int i,count=0;


            for (i = 0; i < num.length; i++) {                    //check if number is prime and remove it

                for (int j = 2; j < num[i]; j++) {
                    if ((num[i] % j) == 0) {

                        count++;
                        break;
                    }
                }
            }

            int composite[] = new int[count];
            int x = 0;

            for (i = 0; i < num.length; i++) {

                for (int j = 2; j < num[i]; j++) {
                    if ((num[i] % j) == 0) {
                        composite[x] = num[i];
                        x++;
                        break;
                    }
                }
            }



        return composite;
    }
    public int[] ReverseNum(int [] num)                    //make number reverse and return
    {
        int i,j=num.length;
        int[] arr=new int[j];

            for (i=0;i<num.length;i++) {
                arr[j-1] = num[i];
                j=j-1;
            }

        return  arr;
    }
}
