package ru.mirea.task7.point2_3_4;

public class Circle extends Shape {
    private double radius;
    Circle(){}
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius,String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Shape: Circle, radius: "+this.radius+", color: "+this.color;
    }
}
