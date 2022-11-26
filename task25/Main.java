package ru.mirea.task25;

import ru.mirea.task7.point2_3_4.Shape;

public class Main {
    public static void main(String[] args){
        Shape1 rec = new Rectangle();
        RedShapeDecorator rsd =new RedShapeDecorator(rec);
        rsd.setRedBorder();
        rsd.draw();
        System.out.println();
        Shape1 cir = new Circle();
        RedShapeDecorator rsd1 = new RedShapeDecorator(cir);
        rsd1.setRedBorder();
        rsd1.draw();
    }
}
abstract class ShapeDecorator{
    Shape1 shape;
    public ShapeDecorator(Shape1 shape){
        this.shape=shape;
    }
    public abstract void draw();
}
class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape1 shape){
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
    }
    void setRedBorder(){
        System.out.println("Red border");
    }
}
interface Shape1{
    public void draw();
}
class Circle implements Shape1{
    public void draw(){
        System.out.println("Circle");
    }
}
class Rectangle implements Shape1{
    public void draw(){
        System.out.println("Rectangle");
    }
}