package ru.mirea.task18;

import java.math.BigInteger;

public class InnExeption extends Exception{
    private BigInteger inn;
    public InnExeption(BigInteger inn){
        super("ИНН c номером "+inn+" не действителен.");
        this.inn=inn;
    }
    public BigInteger getInn(){ return inn;}
}
