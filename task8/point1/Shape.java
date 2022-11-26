package ru.mirea.task8.point1;
import java.awt.*;

public abstract class Shape {
    protected Color color;
    protected Point point;
    public Shape(Color color,Point point){
        this.color=color;
        this.point=point;
    }
    public Shape(){
        this.color=Color.GREEN;
    }
    public Point getPoint(){
        return point;
    }
    public void setPoint(Point point){
        this.point=point;
    }
    public abstract Color getColor();
}