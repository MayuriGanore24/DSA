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
        input=input.toLowerCase();
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
     public boolean isAnagram(String str1,String str2){
         str1=str1.replaceAll("//s","").toLowerCase();
         str2=str2.replaceAll("//s","").toLowerCase();
         if(str1.length()!=str2.length()){
             return false;
         }
         int arr[]=new int[256];
         for(int i=0;i<str1.length();i++){
             arr[str1.charAt(i)]++;
             arr[str2.charAt(i)]--;
         }
         for(int i=0;i<arr.length;i++){
             if(arr[i]!=0)
                return false;
         }
         return true;
     }
     public String reverseString(String input){
         input=input.replaceAll("//s","").toLowerCase();
         if(input.length()<2){
             return input;
         }
         char []arr=input.toCharArray();
         int i=0;
         int j=arr.length-1;
         while(i<j){
             char temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
         }
         input=new String(arr);
         return input;
     }
}
