package ru.mirea.task3.circle;

public class Circle {
    private String color;
    private int square;

    public Circle(String color,int square){
        this.color=color;
        this.square=square;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setSquare(int square){
        this.square = square;
    }
    public String getColor(){
        return color;
    }
    public int getSquare(){
        return square;
    }
    public String toString(){
        return this.color + " and " + this.square + " m^2";
    }
}
