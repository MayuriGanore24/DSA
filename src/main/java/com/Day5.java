package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Day5 {
    public HashMap<Character,Integer>countVowels(String input){
        if(input.isEmpty()){
            return null;
        }
        input=input.toLowerCase();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                map.put(ch,map.getOrDefault(ch,0)+1);   
            }
        }
        return map;
    }

    public HashMap<String,Integer>getStudentsWithMarksGreaterThan80(HashMap<String,Integer>students){
        if(students.isEmpty()){
            return null;
        }
        HashMap<String,Integer>map=new HashMap<>();
        for(HashMap.Entry<String,Integer>student:students.entrySet()){
            if(student.getValue()>80){
                map.put(student.getKey(),student.getValue());
            }
        }
        return map;   
    }
    public HashMap<String,Integer>getFrequencyCountOfWords(String input){
        if(input.isEmpty())
            return null;
        String []words=input.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            map.put(word,map.getOrDefault(word,0)+1);
        }
        return map;
    }
    public HashSet<Integer> getUniqueNumbers(int arr[]){
        if(arr.length<1){
            return null;
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set;
    }
    public ArrayList<Character> getUniqueCharacters(String input){
        if(input.isEmpty()){
            return null;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Character>result=new ArrayList<>();
        for(HashMap.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
