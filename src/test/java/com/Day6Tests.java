package com;

import org.junit.jupiter.api.Test;
import com.example.java.Day6;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Day6Tests {
    @Test
    public void testGetCountOfEvenOddNumbersShouldReturnCorrectCounts(){
        Day6 day6=new Day6();
        int input[]={1,2,3,4,5,6};
        HashMap<String,Integer>result=day6.getCountOfEvenOddNumbers(input);
        assertEquals(3,result.get("Even"));
        assertEquals(3,result.get("Odd"));
    }
    @Test
    public void testGetCountOfEvenOddNumbersShouldReturnNullForEmptyArray(){
        Day6 day6=new Day6();
        int input[]={};   
        HashMap<String,Integer>result=day6.getCountOfEvenOddNumbers(input);
        assertEquals(null,result);
    }
}
