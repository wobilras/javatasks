package ru.mirea.task10;

import java.util.Scanner;

public class Point16 {
    public static void main(String[] args){
        System.out.println("введитите последовательность чисел, заканчивающуюся 0");
        int max=0, count=0;
        int answer=sixteen(max,count);
        System.out.println("кол-во максимальных чисел в последовательности = "+answer);
    }
    public static int sixteen(int max,int count){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        if (n==0) return count;
        if (max<n) {
            max=n;
            count=0;
        }
        if (n==max) count++;
        return sixteen(max, count);
    }

}
