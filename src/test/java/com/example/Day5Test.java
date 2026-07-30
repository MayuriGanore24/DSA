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
}
