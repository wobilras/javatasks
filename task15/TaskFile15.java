package ru.mirea.task15;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskFile15 {
    public static List<String> replace(List<String> list, String oldStr, String newStr) {
        String str = "";
        for (int i = 0; i < list.size(); ++i) {
            if (i != list.size() - 1)
                str += list.get(i) + '\n';
            else
                str += list.get(i);
        }
        str=str.replaceFirst(oldStr,newStr);
        list= Arrays.asList(str.split("\n"));
        return list;
    }
    public static void printMenu(){
        System.out.println("\n1) Перезаписать файл");
        System.out.println("2) Вывести файл на экран");
        System.out.println("3) Заменить информацию в файле");
        System.out.println("4) Добавить в конец файла");
        System.out.println("0) Выход");
        System.out.println("Ввод: ");
    }
    public static void main(String[] args){
        int ans = 100;
        Scanner scanner = new Scanner(System.in);
        String data;
        String path = "./src/ru/mirea/task15/file.txt";
        while(ans!=0){
            printMenu();
            ans= Integer.parseInt(scanner.nextLine());
            switch (ans){
                case 1:
                    try(FileWriter writer = new FileWriter(path, false)){
                        System.out.print("введите данные: ");
                        data = scanner.nextLine();
                        writer.write(data);
                        writer.close();
                        System.out.println("Запись проведена успешно");
                    }
                    catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    try(FileReader reader = new FileReader(path)){
                        int c;
                        while((c=reader.read())!=-1)
                            System.out.print((char)c);
                    }
                    catch (IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    String newData;
                    File file = new File(path);
                    List<String> lines;
                    try(FileReader reader = new FileReader(path)){
                        lines = Files.readAllLines(file.toPath());
                        System.out.print("Введите что хотите заменить");
                        data = scanner.nextLine();
                        System.out.println("На что заменить");
                        newData = scanner.nextLine();
                        lines = replace(lines, data, newData);
                        Files.write(file.toPath(),lines);
                    }
                    catch (IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    try(FileWriter writer = new FileWriter(path, true)){
                        System.out.print("Введите данные");
                        data=scanner.nextLine();
                        writer.write(System.getProperty("line.separator")+data);
                        System.out.println("Данные дозаписаны в конец");
                    }
                    catch (IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                default: break;
            }
        }
    }
}
