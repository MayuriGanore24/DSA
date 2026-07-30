package com.example;

import org.junit.jupiter.api.Test;
import com.Day5;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Day5Test {
    @Test
    public void testCountVowelsShouldReturnCorrectCountsOfVowels(){
        Day5 day5=new Day5();
        HashMap<Character,Integer>result=day5.countVowels("hEllo world");
        assertEquals(1,result.get('e'));
        assertEquals(2,result.get('o'));    
    }
    @Test
    public void testCountVowelsShouldReturnNullForEmptyString(){
        Day5 day5=new Day5();
        HashMap<Character,Integer>result=day5.countVowels("");
        assertEquals(null,result);
    }
    @Test
    public void testCountVowelsShouldReturnNullForStringWithNoVowels(){
        Day5 day5=new Day5();
        HashMap<Character,Integer>result=day5.countVowels("xyz");
        assertEquals(new HashMap<>(),result);
    }
}
