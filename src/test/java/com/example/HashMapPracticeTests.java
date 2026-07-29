package com.example;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

import com.HashMapPractice;
public class HashMapPracticeTests {
    HashMapPractice hashMapPractice=new HashMapPractice();
    @Test
    public void printStudentNamesShouldPrintStudentNames(){
        hashMapPractice.printStudentNames();
    }
    @Test
    public void printStudentNamesShouldPrintStudentNamesForEmptyMap(){
        hashMapPractice.printStudentNames();
    }

    @Test
    public void characterFrequencyShouldReturnCorrectFrequencyForHelloWorld(){
        String input="Hello World";
        HashMap<Character,Integer>result=HashMapPractice.characterFrequency(input);
        assert result.get('H')==1;
        assert result.get('e')==1;
        assert result.get('l')==3;
        assert result.get('o')==2;
        assert result.get(' ')==1;
        assert result.get('W')==1;
        assert result.get('r')==1;
        assert result.get('d')==1;
    }
    @Test
    public void characterFrequencyShouldReturnNullForNullInput(){
        String input=null;
        HashMap<Character,Integer>result=HashMapPractice.characterFrequency(input);
        assert result==null;
    }

    @Test
    public void arrayFrequencyShouldReturnCorrectFrequencyForArray(){
        int arr[]={1,2,3,1,2,1};
        HashMap<Integer,Integer>result=HashMapPractice.arrayFrequency(arr);
        assert result.get(1)==3;    
    }

    @Test
    public void arrayFrequencyShouldReturnNullForEmptyArray(){
        int arr[]={};
        HashMap<Integer,Integer>result=HashMapPractice.arrayFrequency(arr);
        assert result==null;
    }


    @Test
    public void firstNonRepeatingCharacterShouldReturnCorrectCharacterForHelloWorld(){
        String input="Hello World";
        Character result=HashMapPractice.firstNonRepeatingCharacter(input); 
        assert result=='H';
    }

    @Test
    public void firstNonRepeatingCharacterShouldReturnNullForEmptyString(){
        String input="";
        Character result=HashMapPractice.firstNonRepeatingCharacter(input); 
        assert result==null;
    }

    @Test
    public void isAnagramShouldReturnTrueForListenAndSilent(){
        String str1="listen";
        String str2="silent";
        boolean result=HashMapPractice.isAnagram(str1,str2);
        assert result==true;
    }
    @Test
    public void isAnagramShouldReturnFalseForHelloAndWorld(){
        String str1="Hello";
        String str2="World";      
        boolean result=HashMapPractice.isAnagram(str1,str2);
        assert result==false;
    }
}
