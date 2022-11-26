package ru.mirea.task12;

import java.util.Arrays;

public class SortingStudentsByGPA {
    public static void quickSort(Comparable[] list, int start, int end){
        int leftMarker = start;
        int rightMarker = end;
        int pivot = (int) list[(leftMarker + rightMarker)/2];
        do {
            //двигаем левый маркер слева направо пока элемент < pivot
            while(list[leftMarker].compareTo(pivot)>0)
                leftMarker++;
            //двигаем правый маркер пока элемент > pivot
            while(list[rightMarker].compareTo(pivot)<0)
                rightMarker--;
            //нужно ли менять местами эелементы, на которые указывают маркеры
            if (leftMarker<=rightMarker){
                if (leftMarker<rightMarker){
                    int tmp = (int)list[leftMarker];
                    list[leftMarker]=list[rightMarker];
                    list[rightMarker]=tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        }while (leftMarker<=rightMarker);
        if(leftMarker<end)
            quickSort(list,leftMarker,end);
        if(start<rightMarker)
            quickSort(list,start,rightMarker);
    }
    public static void main(String[] args){
        Comparable[] list = new Comparable[10];
        for (int i=0;i<list.length;i++)
            list[i]=(int)(1+Math.random()*5);
        int start =0;
        int end = list.length -1;
        quickSort(list,start,end);
        System.out.println(Arrays.toString(list));
    }
}
