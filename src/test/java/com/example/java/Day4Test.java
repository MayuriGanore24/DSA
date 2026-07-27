package com.example.java;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import net.bytebuddy.asm.Advice.Thrown;
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

    @Test
    public void firstDuplicateShouldReturn1For1231(){
        int arr[]={1,2,3,1};
        int result=day4.firstDuplicate(arr);
        Assertions.assertEquals(1,result);
    }
    @Test
    public void firstDuplicateShouldReturnMinus1For1234(){
        int arr[]={1,2,3,4};
        int result=day4.firstDuplicate(arr);
        Assertions.assertEquals(-1,result);
    }
    @Test
    public void firstDuplicateShouldReturnMinus1ForEmptyArray(){
        int arr[]={};
        int result=day4.firstDuplicate(arr);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void hasCommonElementShouldReturnTrueFor123And345(){
        int arr1[]={1,2,3};
        int arr2[]={3,4,5};
        boolean result=day4.hasCommonElement(arr1,arr2);
        Assertions.assertTrue(result);
    }
    @Test
    public void hasCommonElementShouldReturnFalseFor123And456(){
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};
        boolean result=day4.hasCommonElement(arr1,arr2);
        Assertions.assertFalse(result);
    }
    @Test
    public void hasCommonElementShouldReturnFalseForEmptyArrays(){
        int arr1[]={};      
        int arr2[]={};
        boolean result=day4.hasCommonElement(arr1,arr2);
        Assertions.assertFalse(result);
    }


    @Test
    public void longestConsecutiveShouldReturn4For100200300400500(){
        int arr[]={100,200,300,400,500};
        int result=Day4.longestConsecutive(arr);
        Assertions.assertEquals(1,result);
    }
    @Test
    public void longestConsecutiveShouldReturn5For12345(){
        int arr[]={1,2,3,4,5};  
        int result=Day4.longestConsecutive(arr);
        Assertions.assertEquals(5,result);
    }
    @Test
    public void longestConsecutiveShouldReturn0ForEmptyArray(){
        int arr[]={};
        int result=Day4.longestConsecutive(arr);
        Assertions.assertEquals(0,result);
    }
}
