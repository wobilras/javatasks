package ru.mirea.task4.ball;

public class testBall {
    public static void main(String[] args){
        Ball b0 = new Ball(5,5);
        System.out.println(b0);
        b0.move(10,20);
        System.out.println(b0);
    }
}
