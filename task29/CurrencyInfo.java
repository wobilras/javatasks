package ru.mirea.task29;

import java.io.Serializable;
import java.util.Arrays;

public class CurrencyInfo implements Serializable {
    private static final long serialVersionID = 1L;
    private String[] money;
    private String[] accessories;
    private String[] health;
    public CurrencyInfo(String[] money, String[] accessories, String[] health){
        this.money=money;
        this.accessories=accessories;
        this.health=health;
    }
    public String[] getMoney(){
        return money;
    }
    public String[] getAccessories() {
        return accessories;
    }
    public String[] getHealth() {
        return health;
    }
    public void setMoney(String[] money) {
        this.money = money;
    }
    public void setAccessories(String[] accessories) {
        this.accessories = accessories;
    }
    public void setHealth(String[] health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{\n"+"Money: "+ Arrays.toString(money)+"\nAccessories: "+Arrays.toString(accessories)+"\nHealth: "+Arrays.toString(health)+"\n}";
    }
}
