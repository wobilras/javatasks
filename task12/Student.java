package ru.mirea.task12;

import java.util.Arrays;

public class Student {
    private int iDNumber[];
    public Student() {
        iDNumber = new int[10];
        for (int i=0;i<iDNumber.length;i++){
            iDNumber[i] =(int)(Math.random()*100);{
                System.out.print(iDNumber[i]+" ");
            }
        }
        System.out.println();
    }
    public void Sort(){
        for (int left=0;left<iDNumber.length;left++){
            int tmp=iDNumber[left];//вынимаем значение
            int i=left-1;//проходим по элементам перед вынутым
            for(;i>=0;i--){
                if (tmp<iDNumber[i])//если вынут < - передвигаем значение дальше
                    iDNumber[i+1]=iDNumber[i];
                else break;//вынут > - останавливаемся
            }
            iDNumber[i+1]=tmp;//в освободившееся пространство вставляем вынутое значение
        }
        System.out.print(Arrays.toString(iDNumber));
    }
    public static void main(String[] args){
        Student s = new Student();
        s.Sort();
    }
}
