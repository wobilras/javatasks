package ru.mirea.task5.dog;

public class testDog {
    public static void main(String[] args){
        Taksa t =new Taksa(10,"Деб", 100);
        Shpitz s = new Shpitz(2,"Тандыр", 20);
        t.Info();
        s.Info();
    }
}
