package ru.mirea.task1;
import java.util.Scanner;

public class task1_point7 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("какое число возвести в факториал: ");
        int num=scanner.nextInt();
        int f=factorial(num);
        System.out.println("факториал числа "+num+" = "+f);
    }
    public static int factorial(int num){
        int tmp=1;
        for (int i=1;i<=num;i++){
            tmp=tmp*i;
        }
         return tmp;
    }
}
