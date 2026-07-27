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

    public boolean containsDuplicate(int[] arr){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.add(arr[i])==false){
                return true;
            }
        }
        return false;
    }
    public int firstDuplicate(int[] arr){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.add(arr[i])==false){
                return arr[i];
            }
        }
        return -1;
    }
     public boolean hasCommonElement(int[] arr1, int[] arr2){
        HashSet<Integer>set=new HashSet<>();
        if(arr1.length==0 || arr2.length==0){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
           if(set.add(arr2[i])==false)
               return true;
        }
        return false;
    }
    public static int longestConsecutive(int[] arr){
        if(arr.length<1)
            return 0;
        HashSet <Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int longestStreak=0;
        int currentStreak=0;
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i]-1)){
                int start=arr[i];
                currentStreak=1;
                while(set.contains(start+1)){
                    start++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
