package com.example.java;

import java.util.HashSet;

public class Day4 {
    public int returnUniqueNumberCount(int arr[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add (arr[i]);
        }
        return set.size();
    }
    
}
