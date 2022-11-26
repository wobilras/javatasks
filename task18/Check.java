package ru.mirea.task18;

import java.math.BigInteger;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ИНН");
        while (true){
            try {
                BigInteger inn = new BigInteger(scanner.nextLine());
                checkInn(inn);
                break;
            } catch (InnExeption e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("ИНН действителен");
    }

    public static boolean checkInn(BigInteger inn) throws InnExeption{
        int i=0;
        BigInteger cInn = new BigInteger(inn.toByteArray());
        while(!cInn.equals(new BigInteger("0"))){
            i++;
            cInn = new BigInteger(cInn.divide(new BigInteger("10")).toByteArray());
        }
        if (i != 10 && i != 12) throw new InnExeption(inn);
        return true;
    }
}
