package com.example;

import org.junit.jupiter.api.Test;
import com.Day5;
import java.util.HashMap;
import java.util.HashSet;
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


    @Test
    public void testGetStudentsWithMarksGreaterThan80ShouldReturnCorrectStudents(){
        Day5 day5=new Day5();
        HashMap<String,Integer>students=new HashMap<>();
        students.put("Alice",90);
        students.put("Bob",75);
        students.put("Charlie",85);
        HashMap<String,Integer>result=day5.getStudentsWithMarksGreaterThan80(students);
        assertEquals(2,result.size());
        assertEquals(90,result.get("Alice"));
        assertEquals(85,result.get("Charlie"));
    }
    @Test
    public void testGetStudentsWithMarksGreaterThan80ShouldReturnNullForEmptyMap(){
        Day5 day5=new Day5();
        HashMap<String,Integer>students=new HashMap<>();     
        HashMap<String,Integer>result=day5.getStudentsWithMarksGreaterThan80(students);
        assertEquals(null,result);
    }
    @Test
    public void testGetStudentsWithMarksGreaterThan80ShouldReturnEmptyMapForNoStudentsAbove80(){
        Day5 day5=new Day5();
        HashMap<String,Integer>students=new HashMap<>();
        students.put("Alice",70);
        students.put("Bob",75);
        HashMap<String,Integer>result=day5.getStudentsWithMarksGreaterThan80(students);
        assertEquals(0,result.size());
    }

    @Test
    public void testGetFrequencyCountOfWordsShouldReturnCorrectCounts(){
        Day5 day5=new Day5();
        HashMap<String,Integer>result=day5.getFrequencyCountOfWords("hello world hello");
        assertEquals(2,result.get("hello"));
        assertEquals(1,result.get("world"));
    }
    @Test
    public void testGetFrequencyCountOfWordsShouldReturnNullForEmptyString(){
        Day5 day5=new Day5();
        HashMap<String,Integer>result=day5.getFrequencyCountOfWords("");
        assertEquals(null,result); 
    }


    @Test
    public void testGetUniqueNumbersShouldReturnCorrectUniqueNumbers(){
        Day5 day5=new Day5();
        int arr[]={1,2,3,2,1};
        HashSet<Integer>result=day5.getUniqueNumbers(arr);
        assertEquals(3,result.size());
        assertEquals(true,result.contains(1));
        assertEquals(true,result.contains(2));
        assertEquals(true,result.contains(3));
    }
    @Test
    public void testGetUniqueNumbersShouldReturnNullForEmptyArray(){
        Day5 day5=new Day5();
        int arr[]={};
        HashSet<Integer>result=day5.getUniqueNumbers(arr);
        assertEquals(null,result);
    }
    @Test
    public void testGetUniqueNumbersShouldReturnSetWithOneElementForArrayWithOneElement(){
        Day5 day5=new Day5();
        int arr[]={5};
        HashSet<Integer>result=day5.getUniqueNumbers(arr);
        assertEquals(1,result.size());
        assertEquals(true,result.contains(5));
    }
}
