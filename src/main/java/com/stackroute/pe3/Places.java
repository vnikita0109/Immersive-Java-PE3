package com.stackroute.pe3;

import java.util.Scanner;

public class Places {

   public String[] remVowels(String[] arr)
   {
       for (int i = 0; i < arr.length; i++) {
           String str = arr[i];
           String[] result=new String[arr.length];

           for (int b = 0; b < str.length(); b++) {

               if ((str.charAt(b) == 'a')||(str.charAt(b) == 'e')||(str.charAt(b) == 'i')||(str.charAt(b) == 'o')||(str.charAt(b) == 'u')){
                  str= str.replaceAll("[AaEeIiOoUu]", "");
                   result[i]=str.toString();
               }
               else if(str=="")
               {
                   System.out.println("Input string cannot be null");
                   result[i]=str.toString();
               }
               else
               {
                   result[i]=str.toString();
               }
           }
           return result;
       }

       return null;
   }

}
