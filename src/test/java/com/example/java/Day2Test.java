package com.example.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day2Test {
    @Test
    public void reverseArrayInPlaceShouldReturn4321(){
        int arr[]={1,2,3,4};
        Day2 day2=new Day2();
        day2.reverseArrayInPlace(arr);
        Assertions.assertEquals(4,arr[0]);
        Assertions.assertEquals(3,arr[1]);
        Assertions.assertEquals(2,arr[2]);
        Assertions.assertEquals(1,arr[3]);
    }
    @Test
    public void reverseArrayInPlaceShouldReturnEmptyArray(){
        int arr[]={};
        Day2 day2=new Day2();
        day2.reverseArrayInPlace(arr);
        Assertions.assertEquals(0,arr.length);
    }
    @Test
    public void reverseArrayInPlaceShouldReturn10(){
        int arr[]={10};
        Day2 day2=new Day2();
        day2.reverseArrayInPlace(arr);
        Assertions.assertEquals(10,arr[0]);
    }
}
