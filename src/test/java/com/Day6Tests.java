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

    @Test
    public void testGetMaxFrequencyCharacterShouldReturnCorrectCharacter(){
        Day6 day6=new Day6();
        String input="hello world";
        Character result=day6.getMaxFrequencyCharacter(input);
        assertEquals('l',result);
    }
    @Test
    public void testGetMaxFrequencyCharacterShouldReturnNullForEmptyString(){
        Day6 day6=new Day6();   
        String input="";
        Character result=day6.getMaxFrequencyCharacter(input);
        assertEquals(null,result);
    }


    @Test
    public void testGetDuplicateCharactersShouldReturnCorrectCharacters(){
        Day6 day6=new Day6();
        String input="hello world";
        assertEquals(true,day6.getDuplicateCharacters(input).contains('l'));
        assertEquals(true,day6.getDuplicateCharacters(input).contains('o'));
    }
    @Test
    public void testGetDuplicateCharactersShouldReturnNullForEmptyString(){
        Day6 day6=new Day6();
        String input="";
        assertEquals(null,day6.getDuplicateCharacters(input)); 
    }
}
