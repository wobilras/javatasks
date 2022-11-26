package ru.mirea.task3.human;

public class testHuman {
    public static void main(String[] args){
        Human o = new Human();
        System.out.println(o);
        o.setHeadEyes("blue");
        o.setHeadhair("Red");
        o.setHeadDef("freckles");
        o.setLegs(50);
        o.setHands(50);
        System.out.println(o);
    }
}
