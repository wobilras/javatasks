package ru.mirea.task2.shape;

public class Shape {
    private String color;
    private String type;
    private int square;

    public Shape(String color, String type,int square){
        setColor(color);
        setType(type);
        setSquare(square);
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setSquare(int square){
        this.square = square;
    }
    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    public int getSquare(){
        return square;
    }
    public String toString(){
        return this.type+" - "+this.color+" and "+ this.square+" m^2";
    }
}
