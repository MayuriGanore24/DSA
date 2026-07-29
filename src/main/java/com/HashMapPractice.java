package com;
import java.util.HashMap;
public class HashMapPractice {
    public void printStudentNames(){
        HashMap<Integer,String>students=new HashMap<>();
        students.put(101,"A");
        students.put(102,"B");
        students.put(103,"C");
        students.put(104,"D");
        students.put(105,"F");
        for(int id:students.keySet()){
            System.out.println(students.get(id)+"\n");
        }
    }
    public static HashMap<Character, Integer> characterFrequency(String str){
        if(str==null)
            return null;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map;
    }
    public static HashMap<Integer, Integer> arrayFrequency(int[] arr){
        if(arr.length<1)
            return null;
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return map;
    }
    public static Character firstNonRepeatingCharacter(String str){
        if(str.length()<1){
            return null;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        } 
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(map.get(ch)==1){
                return ch;
            }
        }
        return null;
    }
    public static boolean isAnagram(String str1, String str2){
        if(str1.isEmpty()|| str2.isEmpty()){
            return false;
        }
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        return map1.equals(map2);
    }
}
