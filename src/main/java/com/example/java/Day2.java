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
    public boolean checkIfArrayIsSorted(int arr[]){
        if(arr.length<2)
            return true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
    public int[] moveZerosToEnd(int arr[]){
        if(arr.length<2)
            return arr;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }
        return arr;
    }
    public int removeDuplicates(int[] arr){
        if(arr.length==0)
            return 0;
        if(arr.length==1)
            return 1;
        int i=0;
        int j=1;
        int index=1;
        while(j<arr.length){
            if(arr[i]==arr[j])
                j++;
            else{
                arr[index]=arr[j];
                i=j;
                j++;
                index++;
            }
        }
        return index;
    }
}
