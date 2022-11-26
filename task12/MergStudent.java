package ru.mirea.task12;

import java.util.Arrays;

public class MergStudent {
    private static int[] mergeSort(int[] input) {
        if (input.length == 1)
            return input;
        int length = input.length/2;
        int[] left = new int[length];
        int[] right = new int[input.length- length];
        for(int i=0;i<length;i++)
            left[i]=input[i];
        for (int i=length;i<input.length;i++)
            right[i-length]=input[i];
        return merge(mergeSort(left),mergeSort(right));
    }
    private static int[] merge(int[] left, int[] right){
        int[] merged = new int[left.length+right.length];
        int lengthLeft = left.length;
        int lengthRight = right.length;
        while (lengthLeft>0 && lengthRight>0){
            if (left[left.length-lengthLeft]<right[right.length-lengthRight]){
                merged[merged.length-lengthLeft-lengthRight]=left[left.length-lengthLeft];
                lengthLeft--;
            }
            else{
                merged[merged.length-lengthLeft-lengthRight]=right[right.length-lengthRight];
                lengthRight--;
            }
        }
        while(lengthLeft>0){
            merged[merged.length-lengthLeft]=left[left.length-lengthLeft];
            lengthLeft--;
        }
        while(lengthRight>0){
            merged[merged.length-lengthRight]=right[right.length - lengthRight];
            lengthRight--;
        }
        return merged;
    }
    public static void main(String[] args){
        int[] arr1 = new int[]{55,65,75,85,95};
        int[] arr2 = new int[]{12,54,32,87,10};
        int[] arr = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr,0,arr1.length);
        System.arraycopy(arr2,0,arr,arr1.length,arr2.length);
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
