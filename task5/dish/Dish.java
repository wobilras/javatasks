package ru.mirea.task5.dish;

public abstract class Dish {
    private String material;
    private int depth;

    public Dish(String material, int depth){
        this.material=material;
        this.depth=depth;
    }
    public String getMaterial() {
        return material;
    }
    public int getDepth() {
        return depth;
    }
    public abstract void Info();
}

class Pan extends Dish{
    private String where;

    public Pan(String material, int depth, String where){
        super(material, depth);
        this.where=where;
    }
    public void Info(){
        System.out.println("Кастрюля выполнена из "+super.getMaterial()+", глубиной = "+super.getDepth()+", для готовки в "+where);
    }
}

class Plate extends Dish{
    private String kind;

    public Plate(String material, int depth, String kind){
        super(material, depth);
        this.kind=kind;
    }
    public void Info() {
        System.out.println("Тарелка из "+super.getMaterial()+" для "+kind+" глубиной "+super.getDepth());
    }
}