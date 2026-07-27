package com.example.java;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Day4Test {
    Day4 day4=new Day4();
    @org.junit.jupiter.api.Test
    public void returnUniqueNumberCountShouldReturn3For1231(){
        int arr[]={1,2,3,1};
        int result=day4.returnUniqueNumberCount(arr);
        Assertions.assertEquals(3,result);
    }
    @org.junit.jupiter.api.Test
    public void returnUniqueNumberCountShouldReturn0ForEmptyArray(){
        int arr[]={};
        int result=day4.returnUniqueNumberCount(arr);
        org.junit.jupiter.api.Assertions.assertEquals(0,result);
    }

    @Test
    public void containsDuplicateShouldReturnTrueFor1231(){
        int arr[]={1,2,3,1};
        boolean result=day4.containsDuplicate(arr);
        Assertions.assertTrue(result);
    }
    @Test
    public void containsDuplicateShouldReturnFalseFor1234(){
        int arr[]={1,2,3,4};
        boolean result=day4.containsDuplicate(arr);
        Assertions.assertFalse(result);     
    }
    @Test
    public void containsDuplicateShouldReturnFalseForEmptyArray(){
        int arr[]={};
        boolean result=day4.containsDuplicate(arr);
        Assertions.assertFalse(result);     
    }
}
