package com.example.java;
import org.junit.jupiter.api.Assertions;
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
}
