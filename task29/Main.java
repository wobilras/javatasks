package ru.mirea.task29;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String[] money = {"На аккаунте в начале недели было 100к монет", "На аккаунте в конце недели 20к монет"};
        String[] accesories = {"На 1-ом персонаже фулл сет знати", "На 2-ом персонаже фулл сет ведьмы"};
        String[] health = {"У 1-ого персонажа 120к hp", "у 2-ого персонажа 200к hp"};

        CurrencyInfo currencyInfo = new CurrencyInfo(money,accesories,health);

        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\54vov\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task29\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(currencyInfo);
        objectOutputStream.close();

        FileInputStream inputStream = new FileInputStream("C:\\Users\\54vov\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task29\\save.ser");
        ObjectInputStream objectInputStream =new ObjectInputStream(inputStream);
        CurrencyInfo currencyInfo1 = (CurrencyInfo) objectInputStream.readObject();
        System.out.println(currencyInfo1);
    }
}
