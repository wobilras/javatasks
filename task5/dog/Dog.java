package ru.mirea.task5.dog;

public abstract class Dog {
    private int age;
    private String name;

    public Dog(int age, String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public abstract void Info();
}

class Taksa extends Dog{
    private int length;

    public Taksa(int age,String name, int length){
        super(age, name);
        this.length=length;
    }
    public void Info() {
        System.out.println("Имя: "+super.getName()+", возраст: "+super.getAge()+", длина: "+length);
    }
}

class Shpitz extends Dog{
    private int size;

    public Shpitz(int age,String name, int size){
        super(age, name);
        this.size=size;
    }
    public void Info() {
        System.out.println("Имя: "+super.getName()+", возраст: "+super.getAge()+", размер: "+size);
    }
}
