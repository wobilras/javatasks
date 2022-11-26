package ru.mirea.task7.point2_3_4;

public class Square extends Rectangle {
    Square() {}

    Square(double side) {
        this.width = side;
        this.length = side;
    }

    Square(double side, String color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public String toString() {
        return "Shape: Square, side: " + this.width + ", color: " + this.color;
    }
}
