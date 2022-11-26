package ru.mirea.task19;

import java.util.Scanner;

public class RightTriangle {
    public RightTriangle(int angle1, int angle2, int angle3) throws AngleException{
        if ((angle1 + angle2 + angle3 != 180)||(angle1 !=90 && angle2!=90 && angle3!=90)){
            throw new AngleException("ПРямоугольный треугольник с такими углами создать невозможно.");
        }
        else System.out.println("Треугольник создан.");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите углы треугольника:");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();
        try{
            RightTriangle rt = new RightTriangle(angle1,angle2,angle3);
        } catch (AngleException e){
            e.printStackTrace();
        }
    }
}
