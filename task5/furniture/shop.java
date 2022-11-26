package ru.mirea.task5.furniture;
import java.util.Scanner;

public class shop {
    public static void main(String[] args){
        Wardrobe w=new Wardrobe("дуб","венге",2);
        Bed b=new Bed("дуб", "сибирский", 2);
        System.out.println("Что вы хотите купить: 1 - шкаф; 2 - кровать");
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        if (t==1){
            w.Info();
        }
        else if(t==2){
            b.Info();
        }
        else System.out.println("вы ввели неимеющийся индентификатор!");
    }
}
