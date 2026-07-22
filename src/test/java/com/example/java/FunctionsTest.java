package com.example.java;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FunctionsTest {
    @Test
    public void largestNumberShouldBe5(){
        int [] arr={1,2,3,4,5};
        int largest=Functions.findLargestOfArray(arr);
        Assertions.assertEquals(5,largest);
    }
    @Test
    public void largestNumberShouldBeZero(){
        int [] arr={0,-2,-3,-4,-5};
        int largest=Functions.findLargestOfArray(arr);
        Assertions.assertEquals(0,largest);
    }
    @Test
    public void largestNumberShouldBe4(){
        int [] arr={-1,2,0,-3,4,-5};
        int largest=Functions.findLargestOfArray(arr);
        Assertions.assertEquals(4,largest);
    }


    @Test
    public void smallestNumberShouldBe1(){
        int arr[]={1,2,3,4,5};
        int smallest=Functions.findSmallestOfArray(arr);
        Assertions.assertEquals(1,smallest);
    }
    @Test
    public void smallestNumberShouldBeNegative5(){
        int arr[]={-1,-2,-3,-4,-5};
        int smallest=Functions.findSmallestOfArray(arr);
        Assertions.assertEquals(-5,smallest);
    }
    @Test
    public void smallestNumberShouldBeNegative6(){
        int arr[]={-1,2,0,-3,4,-6};
        int smallest=Functions.findSmallestOfArray(arr);
        Assertions.assertEquals(-6,smallest);
    }


    @Test
    public void sumOfArrayShouldBe15(){
        int arr[]={1,2,3,4,5};
        float sum=Functions.findSumOfArray(arr);
        Assertions.assertEquals(15,sum);
    }
    @Test
    public void sumOfArrayShouldBeNegative15(){
        int arr[]={-1,-2,-3,-4,-5};
        float sum=Functions.findSumOfArray(arr);
        Assertions.assertEquals(-15,sum);
    }
    @Test
    public void sumOfArrayShouldBe0(){
        float sum=Functions.findSumOfArray(new int[]{});
        Assertions.assertEquals(0,sum);
    }


    @Test
    public void countOfEvenNumbersShouldBe2(){
        int count=Functions.countEvenNumbers(new int[]{1,2,3,4,5});
        Assertions.assertEquals(2,count);
    }
    @Test
    public void countOfEvenNumbersShouldBe0(){
        int count=Functions.countEvenNumbers(new int[]{0,3,5,7,9});
        Assertions.assertEquals(0,count);
    }
    @Test
    public void countOfEvenNumbersShouldBe3(){
        int count=Functions.countEvenNumbers(new int[]{-1,-2,0,-3,4,-6});
        Assertions.assertEquals(3,count);
    }

    @Test
    public void linearSearchShouldReturnTrue(){
        Assertions.assertTrue(Functions.linearSearch(new int[]{1,2,3,4,5},3));
    }
    @Test
    public void linearSearchShouldReturnFalse(){
        Assertions.assertFalse(Functions.linearSearch(new int[]{1,2,3,4,5},30));
    }
}
