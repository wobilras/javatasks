package ru.mirea.task21;

import java.util.ArrayList;

public class Metro {
    ArrayList<String> line = new ArrayList<>();
    Metro(){
        line.add("Юго-западная");
        line.add("Проспект Вернадского");
        line.add("Университет");
        line.add("Воробьевы горы");
        line.add("Спортивная");
        line.add("Фрунзенская");
        line.add("Парк культуры");
    }
    public void PrintList(boolean state){
        for (int i =0;i<line.size();i++){
            if(state == true){
                if (i%2==0) System.out.println("Метро: "+line.get(i));
            }
            else if(i%2==1) System.out.println("Метро: "+line.get(i));
        }
    }
    public static void main(String[] args){
        Metro line = new Metro();
        System.out.println("нечетные метро: ");
        line.PrintList(true);
        System.out.println("четные: ");
        line.PrintList(false);
    }
}
