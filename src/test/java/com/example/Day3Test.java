package com.example;

import com.example.java.Day3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day3Test {
    Day3 day3=new Day3();
    @Test
    public void rightRotateByOneShouldReturn2341(){
        int arr[]={1,2,3,4};
        day3.rightRotateByOne(arr);
        Assertions.assertEquals(2,arr[0]);
        Assertions.assertEquals(3,arr[1]);
        Assertions.assertEquals(4,arr[2]);
        Assertions.assertEquals(1,arr[3]);
    }
    @Test
    public void rightRotateByOneShouldReturn1ForSingleElement(){
        int arr[]={1};
        day3.rightRotateByOne(arr);
        Assertions.assertEquals(1,arr[0]);
    }
    @Test
    public void rightRotateByOneShouldReturnEmptyArray(){
        int arr[]={};
        day3.rightRotateByOne(arr);
        Assertions.assertEquals(0,arr.length);
    }
}   

