package com.example.java;

public class Functions {
    public static int findLargestOfArray(int[]arr){
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int findSmallestOfArray(int[]arr){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static float findSumOfArray(int arr[]){
        float sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int countEvenNumbers(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=arr[i]*-1;
            }
            if(arr[i]%2==0&& arr[i]!=0){
                count++;
            }
        }
        return count;
    }
}
