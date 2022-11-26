package ru.mirea.task7.Movable;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString() {
        return "MovablePoint: x:" + x + ", y: " + y + ", xSpeed: " + xSpeed + ", ySpeed:" + ySpeed;
    }
    public void moveUp(){
        y+=ySpeed;
    }
    public void moveDown(){
        y-=ySpeed;
    }
    public void moveRight(){
        x+=xSpeed;
    }
    public void moveLeft(){
        x-=xSpeed;
    }
}
