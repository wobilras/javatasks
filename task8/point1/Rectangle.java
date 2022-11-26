package ru.mirea.task8.point1;

import java.awt.*;

public class Rectangle extends Shape{
    protected int height, width;

    public Rectangle(int x, int y, int height, int width, Color color){
        this.color=color;
        this.point=new Point(x,y);
        this.height=height;
        this.width=width;
    }
    public double getX(){
        return point.getX();
    }
    public double getY(){
        return point.getY();
    }
    public int getHeight(){
        return height;
    }
    public int getWidth() {
        return width;
    }
    @Override
    public Color getColor() {
        return color;
    }
}
