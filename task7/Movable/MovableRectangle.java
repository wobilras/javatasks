package ru.mirea.task7.Movable;

public class MovableRectangle extends MovablePoint implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    MovableRectangle(int x1,int x2, int y1, int y2, int xSpeed, int ySpeed){
        super(0,0,xSpeed,ySpeed);
        topLeft.x=x1;
        topLeft.y=y1;
        bottomRight.x=x2;
        bottomRight.y=y2;
        topLeft.xSpeed=xSpeed;
        topLeft.ySpeed=ySpeed;
        bottomRight.xSpeed=xSpeed;
        bottomRight.ySpeed=ySpeed;
    }
    public boolean isSpeed(){
        return (topLeft.ySpeed== bottomRight.ySpeed && topLeft.xSpeed== bottomRight.xSpeed);
    }

    public String toString() {
        return "MovableRectangle: topLeft:("+topLeft+"), bottomRight:("+bottomRight+"), xSpeed: "+xSpeed+", ySpeed: "+ySpeed;
    }
    public void moveUp(){
        if (isSpeed()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }
    public void moveDown(){
        if (isSpeed()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }
    public void moveRight(){
        if (isSpeed()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
    public void moveLeft(){
        if (isSpeed()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }
}
