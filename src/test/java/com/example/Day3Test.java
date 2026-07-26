package com.example;

import com.example.java.Day3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day3Test {
    Day3 day3=new Day3();
    @Test
    public void leftRotateByOneShouldReturn2341(){
        int arr[]={1,2,3,4};
        day3.leftRotateByOne(arr);
        Assertions.assertEquals(2,arr[0]);
        Assertions.assertEquals(3,arr[1]);
        Assertions.assertEquals(4,arr[2]);
        Assertions.assertEquals(1,arr[3]);
    }
    @Test
    public void leftRotateByOneShouldReturn1ForSingleElement(){
        int arr[]={1};
        day3.leftRotateByOne(arr);
        Assertions.assertEquals(1,arr[0]);
    }
    @Test
    public void leftRotateByOneShouldReturnEmptyArray(){
        int arr[]={};
        day3.leftRotateByOne(arr);
        Assertions.assertEquals(0,arr.length);
    }
    @Test
    public void rightRotateByOneShouldReturn4123(){
        int arr[]={1,2,3,4};
        day3.rightRotateByOne(arr);
        Assertions.assertEquals(4,arr[0]);
        Assertions.assertEquals(1,arr[1]);
        Assertions.assertEquals(2,arr[2]);
        Assertions.assertEquals(3,arr[3]);
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

    @Test
    public void isPalindromeShouldReturnTrueForMadam(){
        String input="Madam";
        boolean result=day3.isPalindrome(input);
        Assertions.assertTrue(result);
    }
    @Test
    public void isPalindromeShouldReturnFalseForHello(){
        String input="hello";
        boolean result=day3.isPalindrome(input);
        Assertions.assertFalse(result);
    }
    @Test
    public void isPalindromeShouldReturnTrueForSingleCharacter(){
        String input="a";
        boolean result=day3.isPalindrome(input);
        Assertions.assertTrue(result);
    }
    @Test
    public void isPalindromeShouldReturnTrueForEmptyString(){
        String input="";
        boolean result=day3.isPalindrome(input);
        Assertions.assertTrue(result);
    }
}   

