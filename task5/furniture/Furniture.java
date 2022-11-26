package ru.mirea.task5.furniture;

public abstract class Furniture {
    private String material;
    private String color;

    public Furniture(String material,String color){
        this.material=material;
        this.color= color;
    }
    public String getMaterial() {
        return material;
    }
    public String getColor() {
        return color;
    }
    public abstract void Info();
}

class Wardrobe extends Furniture{
    private int doors;

    public Wardrobe(String material, String color, int doors){
        super(material, color);
        this.doors=doors;
    }

    public void Info() {
        System.out.println("Шкаф:\n"+"Материал: "+super.getMaterial()+", дверей: "+doors+", цвет:"+super.getColor());
    }
}

class Bed extends Furniture{
    private int places;

    public Bed(String material, String color, int places){
        super(material, color);
        this.places=places;
    }

    public void Info() {
        System.out.println("Кровать:\n"+"Материал: "+super.getMaterial()+", мест: "+places+", цвет:"+super.getColor());
    }
}

