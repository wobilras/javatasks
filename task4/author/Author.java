package ru.mirea.task4.author;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name1,String email1,char gender1){
        name=name1;
        email=email1;
        gender=gender1;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return this.name+" - "+this.gender+" - "+this.email;
    }
}
