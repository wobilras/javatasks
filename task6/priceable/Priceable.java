package ru.mirea.task6.priceable;

public interface Priceable {
    int getPrice();
}
class Products implements Priceable{
    @Override
    public int getPrice() {
        return 1500;
    }
}
class Table implements Priceable{
    @Override
    public int getPrice() {
        return 2800;
    }
}
class Car implements Priceable{
    @Override
    public int getPrice() {
        return 23000000;
    }
}
class TEST{
    public static void main(String[] args){
        Products p =new Products();
        Table t =new Table();
        Car c =new Car();
        System.out.println(p.getPrice());
        System.out.println(t.getPrice());
        System.out.println(c.getPrice());
    }
}