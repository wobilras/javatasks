package ru.mirea.task3.book;

import ru.mirea.task2.book.Book;

public class testBook {
    public static void main(String[] args){
        ru.mirea.task2.book.Book s0=new ru.mirea.task2.book.Book("Пушкин А.С.","Евгений Онегин",1833);
        ru.mirea.task2.book.Book s1=new Book("Пушкин А.С.",  "Дубровский",1841);
        System.out.println(s0);
        System.out.println(s1);
    }
}
