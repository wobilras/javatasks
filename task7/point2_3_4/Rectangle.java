package ru.mirea.task7.point2_3_4;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    Rectangle(){}
    Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.length=length;
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    public String toString(){
        return "Shape: Rectangle, width: "+this.width+", length: "+this.length+", color: "+this.color;
    }
}
