package ru.mirea.task14;

import java.util.Scanner;
import java.util.Stack;

public class Drunkard1 {
    private static Stack<Integer> p1 = new Stack();
    private static Stack<Integer> p2 = new Stack();
    private static int TryNumber=0;

    public static void rec(){
        TryNumber+=1;
        if(p1.get(0)>p2.get(0)){
            if(p1.get(0)!=9 && p2.get(0)!=0) {
                p1.push(p1.get(0));
                p1.push(p2.get(0));
            }
            else{
                p2.push(p2.get(0));
                p2.push(p1.get(0));
            }
        }
        else {
            if(p2.get(0)==9 && p1.get(0)==0){
                p1.push(p1.get(0));
                p1.push(p2.get(0));
            }
            else{
                p2.push(p2.get(0));
                p2.push(p1.get(0));
            }
        }
        p1.pop();
        p2.pop();
        if (p1.isEmpty())
            System.out.println("Second "+TryNumber);
        else if (p2.isEmpty())
            System.out.println("First "+ TryNumber);
        else if (TryNumber==106)
            System.out.println("botva");
        else rec();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int n = scanner.nextInt();
            p1.push(n);
        }
        for(int i=0;i<5;i++){
            int n = scanner.nextInt();
            p2.push(n);
        }
        rec();
    }
}
