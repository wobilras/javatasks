package ru.mirea.task2.dog;

public class testDog {
    public static void main(String[] args){
        Dog s0=new Dog("Доггер",5);
        Dog s1=new Dog("Деб",1);
        System.out.println(s0);
        s0.humanAge();
        System.out.println(s1);
        s1.humanAge();
    }
}
