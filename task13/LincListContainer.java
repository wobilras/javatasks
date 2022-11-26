package ru.mirea.task13;

import java.util.LinkedList;

public class LincListContainer {
    public static void main(String[] args){
        LinkedList<String> pc = new LinkedList<String>();
        pc.add("Видеокарта");
        pc.addFirst("Процессор");
        pc.addLast("ОЗУ");
        pc.add(1,"Материнка");
        System.out.printf("В списке %d элементов\n", pc.size());
        for(String x : pc)
            System.out.println(x);
        if(pc.contains("ОЗУ"))
            System.out.println("В конфигурации есть ОЗУ");
        pc.removeFirst();
        System.out.println("Первый элемент удален");
        for(String x : pc)
            System.out.println(x);
    }
}
