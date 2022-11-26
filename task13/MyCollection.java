package ru.mirea.task13;

import java.util.Arrays;

public class MyCollection {
    private int[] arr;
    public MyCollection(){
        arr = new int[1];
    }
    public MyCollection(int length){
        arr = new int[length];
    }
    public void add(int number){
        arr[arr.length-1]=number;
        arr = Arrays.copyOf(arr, arr.length+1);
    }
    public void remove(int index){
        for(int i=index;i< arr.length-1;i++)
            arr[i]=arr[i+1];
        arr=Arrays.copyOf(arr, arr.length-1);
    }
    public static void main(String[] args){
        MyCollection list = new MyCollection(2);
        System.out.println(list.arr.length);
        list.add(2);
        list.add(5);
        System.out.println(list.arr.length);
        list.remove(0);
        System.out.println(list.arr.length);
    }
}
