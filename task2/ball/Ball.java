package ru.mirea.task2.ball;

public class Ball {
        private String color;
        private int square;

        public Ball(String color,int square){
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
