package ru.mirea.task17;

import java.util.Scanner;

enum Planet{
    Меркурий(3.302e23, 2440), Венера(4.869e24, 6052), Земля(5.974e24, 6378), Марс(6.419e23, 3397),
    Юпитер(1.899e27, 71490), Сатурн(5.685e26, 60270), Уран(8.685e25, 25560), Нептун(1.024e26, 24760);

    private double G = 6.67408e-11;
    private double weight, radius, g;
    Planet(double weight, double radius){
        this.weight=weight;
        this.radius=radius;
        g=(G*weight)/(radius*radius)/10000000;
    }
    public double getG(){return g;}
}

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int planetN;
        System.out.println("Введите номер планеты по удаленности от солнца: ");
        planetN= scanner.nextInt();
        Planet p;
        if (planetN < 9 && planetN > 0){
            System.out.println("Планета: "+ Planet.values()[planetN-1].name());
            System.out.println("Силя притяжения g = "+Planet.values()[planetN-1].getG()+" м/с^2");
        }
        else System.out.println("В солнечной системе нет стольки планет");
    }
}
