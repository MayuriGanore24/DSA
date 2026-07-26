package com.example.java;

public class Day3 {
    public int[] rightRotateByOne(int arr[]){
        if(arr.length<2)
            return arr;
            
        int key=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=key;
        return arr;
    }
}
