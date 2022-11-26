package ru.mirea.task5.dish;

public class testDish {
    public static void main(String[] args){
        Pan o = new Pan("аллюминий", 5,"духовка");
        Plate p = new Plate("керамика", 2, "обеденная");
        p.Info();
        o.Info();
    }
}
