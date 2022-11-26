package ru.mirea.task13;

import java.util.ArrayList;

public class ArrListCollection {
    public static void main(String[] args){
        ArrayList<String> PC = new ArrayList<String>();
        PC.add("Видеокарта");
        PC.add("Материнская плата");
        PC.add("Процессор");
        PC.add(3,"ОЗУ");
        System.out.println(PC.get(1));
        PC.set(1, "Башня");
        System.out.printf("В списке %d элементов \n", PC.size());
        for (String x : PC)
            System.out.println(x);
        if(PC.contains("Процессор"))
            System.out.println("В конфигурации есть процессор");
        PC.remove("Процессор");
        PC.remove(1);
        Object[] config = PC.toArray();
        for(Object conf : config)
            System.out.println(conf);
    }
}
