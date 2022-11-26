package ru.mirea.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Time {
    void task1(){
        System.out.println("Введите дату в формате yyyy-MM-dd HH:mm");
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        String dateString = scanner.next();
        TDate tDate= new TDate();
        Date date = tDate.build(dateString);
        System.out.println(date);
        TCalendar tCalendar = new TCalendar();
        Calendar calendar = tCalendar.build(dateString);
        System.out.println(calendar);
    }
    void task2(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        String lastname;
        String receiptDateStr;
        System.out.println("Введите фамилию");
        lastname = scanner.next();
        System.out.println("Введите дату получения задания в формате yyyy-MM-dd HH:mm");
        receiptDateStr = scanner.next();
        TCalendar tCalendar = new TCalendar();
        Calendar receiptDate = tCalendar.build(receiptDateStr);
        Main main = new Main(lastname, receiptDate);
        main.handover();
        System.out.println(main);
    }
    public static void main(String[] args){
        Time time = new Time();
        time.task1();
        time.task2();
    }
}

class DateBuild{
    long getMlsc(String dateStr){
        long mlsc = -1;
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date date = s.parse(dateStr);
            mlsc = date.getTime();
        } catch (ParseException e){
            e.printStackTrace();
        }
        return mlsc;
    }
}

class TDate extends DateBuild{
    public Date build(String dareStr){
        Date date;
        long mlsc = getMlsc(dareStr);
        date = new Date(mlsc);
        return date;
    }
}

class TCalendar extends DateBuild{
    Calendar build(String dateStr){
        Calendar c = Calendar.getInstance();
        try {
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            c.setTime(s.parse(dateStr));
        } catch (ParseException e){
            e.printStackTrace();
        }
        return c;
    }
}
class Main{
    String lastname;
    Calendar taskReceiptDate;
    Date handoverTaskDate;
    public Main(String lastname, Calendar taskReceiptDate){
        this.lastname = lastname;
        this.taskReceiptDate = taskReceiptDate;
    }
    public void handover(){
        this.handoverTaskDate =new Date();
    }
    public String toString(){
        return "Main{"+
                "lastname='"+lastname+'\''+
                ", taskReceiptDate="+ taskReceiptDate+
                ", handoverTaskDate="+ handoverTaskDate+
                '}';
    }
}