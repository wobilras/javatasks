package ru.mirea.task2.book;

public class Book {
    private String Author;
    private String name;
    private int date;

    public Book(String Author, String name,int date){
        this.Author=Author;
        this.name=name;
        this.date=date;
    }
    public void setAuthor(String Author){
        this.Author=Author;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDate(int date){
        this.date=date;
    }
    public String getAuthor(){
        return Author;
    }
    public String getName(){
        return name;
    }
    public int getDate(){
        return date;
    }
    public String toString(){
        return this.Author+" - "+this.name+" - "+ this.date;
    }
}
