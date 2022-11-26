package ru.mirea.task6.nameable;

public interface Nameable {
    String getName();
}

class Cars implements Nameable{
    @Override
    public String getName() {
        return "Name of car";
    }
}
class Planets implements Nameable{
    @Override
    public String getName() {
        return "name of planet";
    }
}
class Animals implements Nameable{
    @Override
    public String getName() {
        return "name of animal";
    }
}
class TEST{
    public static void main(String[] args){
        Cars c = new Cars();
        Planets p = new Planets();
        Animals a = new Animals();
        System.out.println(c.getName());
        System.out.println(p.getName());
        System.out.println(a.getName());
    }
}