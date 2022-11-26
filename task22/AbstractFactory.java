package ru.mirea.task22;

public class AbstractFactory {
    public  Chair getName(String name){
        Chair chair =null;
        if("Victorian".equals(name)){
            chair = new VictorianChair();
        } else if("Multifunctional".equals(name)){
            chair = new MultifunctionalChair();
        } else chair = new MagicChair();
        return chair;
    }
}
interface Chair{
    void setName(String name);
    String getName();
}
class VictorianChair implements Chair{
    private String name="Victorian";

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
class MultifunctionalChair implements Chair{
    private String name="Multifunctional";

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
class MagicChair implements Chair{
    private String name ="Magic";

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}