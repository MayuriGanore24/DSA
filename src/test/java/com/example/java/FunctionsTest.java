package com.example.java;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FunctionsTest {
    @Test
    public void findLargestOfArrayPositiveNumbers(){
        int [] arr={1,2,3,4,5};
        int largest=Functions.findLargestOfArray(arr);
        Assertions.assertEquals(5,largest);
    }
    @Test
    public void findLargestOfArrayWithNegativeNumbers(){
        int [] arr={-1,-2,-3,-4,-5};
        int largest=Functions.findLargestOfArray(arr);
        Assertions.assertEquals(0,largest);
    }
    @Test
    public void findLargestOfArrayWithMixedNumbers(){
        int [] arr={-1,2,0,-3,4,-5};
        int largest=Functions.findLargestOfArray(arr);
        Assertions.assertEquals(4,largest);
    }


    @Test
    public void findSmallestOFArrayPositiveNumbers(){
        int arr[]={1,2,3,4,5};
        int smallest=Functions.findSmallestOfArray(arr);
        Assertions.assertEquals(1,smallest);
    }
    @Test
    public void findSmallestOfArrayNegativeNumbers(){
        int arr[]={-1,-2,-3,-4,-5};
        int smallest=Functions.findSmallestOfArray(arr);
        Assertions.assertEquals(-5,smallest);
    }
    @Test
    public void findSmallestOfArrayWithMixedNumbers(){
        int arr[]={-1,2,0,-3,4,-5};
        int smallest=Functions.findSmallestOfArray(arr);
        Assertions.assertEquals(-5,smallest);
    }
}
