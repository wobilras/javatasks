package ru.mirea.task10;

import java.util.Scanner;

public class Point1 {
    public static void main(String[] args){
        System.out.println("введитите сколько чисел последовательности вывести = ");
        int n=0,i=1,count=0;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        one(n,i, count);

    }
    public static int one(int n, int i,int count){
        for(int k=1;k<=i;k++) {
            System.out.print(i + " ");
            count++;
        }
        if(count==n) return 0;
        i++;
        return one(n,i,count);
    }
}
