package com.example.java;

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
}
