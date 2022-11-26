package ru.mirea.task1;
import java.util.Scanner;
import java.util.Random;

public class task1_point6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел:");
        int n = scanner.nextInt();
        Random r = new Random();
        int[] mas = new int[n];
        for (int i=0; i<mas.length -1;i++){
            mas[i]= r.nextInt(100);
        }
        for(int i=0;i<mas.length;i++){
            System.out.println(mas[i]);
        }
        for(int i= mas.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(mas[j]>mas[j+1]){
                    int tmp=mas[j];
                    mas[j]=mas[j+1];
                    mas[j+1]=tmp;
                }
            }
        }
        System.out.println("отсортированный массив:");
        for(int i=0;i<mas.length;i++){
            System.out.println(mas[i]);
        }
    }
}
