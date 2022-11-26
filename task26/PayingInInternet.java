package ru.mirea.task26;

import java.util.Scanner;

interface PayStrategy{
    public void payment();
}
class eWalletStrategy implements PayStrategy{
    @Override
    public void payment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оплата при помощи электронного кошелька.\nВведите номер: ");
        String number = scanner.next();
        System.out.println("Введите пароль:");
        String pass = scanner.next();
        System.out.println("Заказ оформлен.");
    }
}
class CardStrategy implements PayStrategy{
    @Override
    public void payment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оплата при помощи карты.\nВведите номер:");
        String number = scanner.next();
        System.out.println("Введите пин:");
        int pin = scanner.nextInt();
        System.out.println("Заказ оформлен.");
    }
}

public class PayingInInternet {
    int orderId;
    PayStrategy payStrategy;
    public PayingInInternet(int orderId){
        this.orderId=orderId;
    }
    public void payment(){
        payStrategy.payment();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете товар по артикулу");
        int order = scanner.nextInt();
        System.out.println("Выберете способ оплаты:\n1 - Электронный кошелек\n2 - Банковская карта");
        int pay = scanner.nextInt();
        PayingInInternet payment;
        if (pay==1)
            payment= new eWalletPayment(order);
        else if(pay==2)
            payment = new CardPayment(order);
        else throw new IllegalStateException("Некорректное значение");
        payment.payment();
    }
}
class eWalletPayment extends PayingInInternet{
    public eWalletPayment(int orderId){
        super(orderId);
        this.payStrategy = new eWalletStrategy();
    }
}
class CardPayment extends PayingInInternet{
    public CardPayment(int orderId){
        super((orderId));
        this.payStrategy = new CardStrategy();
    }
}