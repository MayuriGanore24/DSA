package com.example.java;

public class Day3 {
    public int[] leftRotateByOne(int arr[]){
        if(arr.length<2)
            return arr;
            
        int key=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=key;
        return arr;
    }
    public int[] rightRotateByOne(int arr[]){
        if(arr.length<2)
            return arr;
        int key =arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=key;
        return arr;
     }
     public boolean isPalindrome(String input){
        if(input.length()<=2)
            return true;
        int i=0;
        int j=input.length()-1;
        while(i<j){
            if(input.charAt(i)!=input.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
     }
}
