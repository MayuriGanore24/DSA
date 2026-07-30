package com;

import java.util.HashMap;

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
    
}
