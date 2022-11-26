package ru.mirea.task2.shape;

import ru.mirea.task2.shape.Shape;

public class testShape {
    public static void main(String[] args){
        Shape s0=new Shape("blue","triangle",90);
        Shape s1=new Shape("green", "rectangle", 60);
        System.out.println(s0);
        System.out.println(s1);
    }
}
