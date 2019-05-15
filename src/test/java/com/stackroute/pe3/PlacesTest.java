package com.stackroute.pe3;

import org.junit.Test;

public class PlacesTest {
    Places p=new Places();
    String[] countries={"India","UAE","a",""};

    @Test
    public void CheckIfMoreThanOneVowel(){
        String[] Expected={"nd","","","Input string cannot be null"};
        String[] Result=p.remVowels(countries);
    }
    @Test
    public void CheckIfAllAreVowel(){
        String[] Expected={"nd","","","Input string cannot be null"};
        String[] Result=p.remVowels(countries);
    }
    @Test
    public void CheckIfNull(){
        String[] Expected={"nd","","","Input string cannot be null"};
        String[] Result=p.remVowels(countries);
    }
}
