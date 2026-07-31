package com.example.java;

import java.util.ArrayList;
import java.util.HashMap;

public class Day6 {
    public HashMap<String,Integer> getCountOfEvenOddNumbers(int input[]){
        if(input==null || input.length==0){
            return null;
        }
        HashMap<String,Integer>map=new HashMap<>();
        map.put("Even",0);
        map.put("Odd",0);
        for(int num:input){
            if(num%2==0){
                map.put("Even",map.get("Even")+1);
            }
            else{
                map.put("Odd",map.get("Odd")+1);
            }
        }
        return map;
    }
    public Character getMaxFrequencyCharacter(String input){
        if(input==null||input.length()==0){
            return null;
        }
        input=input.toLowerCase();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<input.length();i++){
            Character ch=input.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=0;
        Character key=null;
        for(HashMap.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                key=entry.getKey();
            }
        }
        return key;
    }
    public ArrayList<Character> getDuplicateCharacters(String input){
        if(input==null || input.length()==0){
            return null;
        }
        input=input.toLowerCase();
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<input.length();i++){
            Character ch=input.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList <Character>ans=new ArrayList<>();
        for(HashMap.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
