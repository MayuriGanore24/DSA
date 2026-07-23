package com.example.java;

public class Day2 {
    public void reverseArrayInPlace(int arr[]){
        if(arr.length==0 || arr.length==1){
            return;
        }    
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
