package ru.mirea.task2.dog;

public class Dog {
    private String name;
    private int age;

    public Dog( String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return this.name+" - "+ this.age +" years";
    }
    public void humanAge(){
        System.out.println(name+" in human age = "+age*7+" years");
    }
}
