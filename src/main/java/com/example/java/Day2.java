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
    public int secondLargestInArray(int arr[]){
        if(arr.length<2){
            return Integer.MIN_VALUE;
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return secondLargest;
    }
}
