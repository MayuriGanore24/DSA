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


    @Test
    public void secondLargestInArrayShouldReturn4(){{
        int arr[]={1,2,3,4};
        Day2 day2=new Day2();
        int secondLargest=day2.secondLargestInArray(arr);
        Assertions.assertEquals(3,secondLargest);
    }
}
    @Test
    public void secondLargestInArrayShouldReturnNegative2(){
        int arr[]={-1,-2,-3,-4};
        Day2 day2=new Day2();
        int secondLargest=day2.secondLargestInArray(arr);
        Assertions.assertEquals(-2,secondLargest);
    }
    @Test
    public void secondLargestInArrayShouldReturnZeroForEmptyArray(){
        int arr[]={};
        Day2 day2=new Day2();
        int secondLargest=day2.secondLargestInArray(arr);
        Assertions.assertEquals(Integer.MIN_VALUE,secondLargest);
    }
    @Test
    public void secondLargestInArrayShouldReturnTwenty(){
        int arr[]={30,30,20};
        Day2 day2=new Day2();
        int secondLargest=day2.secondLargestInArray(arr);
        Assertions.assertEquals(20,secondLargest);
    }   


    @Test
    public void checkIfArrayIsSortedShouldReturnTrue(){
        Day2 day2=new Day2();
        Assertions.assertTrue(day2.checkIfArrayIsSorted(new int[]{1,2,3,4,5}));
    }
    @Test
    public void checkIfArrayIsSortedShouldReturnFalse(){
        Day2 day2=new Day2();
        Assertions.assertFalse(day2.checkIfArrayIsSorted(new int[]{1,9,4,5}));
    }
    @Test
    public void checkIfArrayIsSortedShouldReturnTrueForEmptyArray(){
        Day2 day2=new Day2();
        Assertions.assertTrue(day2.checkIfArrayIsSorted(new int[]{}));
    }
    @Test
    public void checkIfArrayIsSortedShouldReturnTrueForArrayWithOneElement(){
        Day2 day2=new Day2();
        Assertions.assertTrue(day2.checkIfArrayIsSorted(new int[]{2}));
    }
    @Test
    public void checkIfArrayIsSortedShouldReturnTrueForArrayWithDuplicateElements(){
        Day2 day2=new Day2();
        Assertions.assertTrue(day2.checkIfArrayIsSorted(new int[]{2,2}));
    }


    @Test 
    public void moveZerosToEndShouldReturn123000(){
        Day2 day2=new Day2();
        int arr[]={1,0,2,0,3,0};
        int[] result=day2.moveZerosToEnd(arr);
        Assertions.assertArrayEquals(new int[]{1,2,3,0,0,0},result);
    }
    @Test 
    public void moveZerosToEndShouldReturn123(){
        Day2 day2=new Day2();
        int arr[]={1,2,3};
        int[] result=day2.moveZerosToEnd(arr);
        Assertions.assertArrayEquals(new int[]{1,2,3},result);
    }
    @Test 
    public void moveZerosToEndShouldReturn0(){
        Day2 day2=new Day2();
        int arr[]={0};
        int[] result=day2.moveZerosToEnd(arr);
        Assertions.assertArrayEquals(new int[]{0},result);
    }

    @Test
    public void removeDuplicatesShouldReturnLengthOfArrayWithoutDuplicatesAs3(){
        Day2 day2=new Day2();
        int arr[]={1,1,2,2,3,3};
        int length=day2.removeDuplicates(arr);
        Assertions.assertEquals(3,length);
    }
    @Test
    public void removeDuplicatesShouldReturnLengthOfArrayWithoutDuplicatesAs0ForEmptyArray(){
        Day2 day2=new Day2();
        int arr[]={};
        int length=day2.removeDuplicates(arr);
        Assertions.assertEquals(0,length);
    }
}