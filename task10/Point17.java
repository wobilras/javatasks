package ru.mirea.task10;

import java.util.Scanner;

public class Point17 {
    public static void main(String[] args){
        System.out.println("введитите последовательность чисел, заканчивающуюся 0");
        int max=0;
        int answer=seventeen(max);
        System.out.println("максимальное число в последовательности = "+answer);
    }
    public static int seventeen(int max){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        if (n==0) return max;
        if (max<n) max=n;
        return seventeen(max);
    }
}
