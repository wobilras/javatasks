package ru.mirea.task14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Drunkard3 {
        private static Deque<Integer> p1 = new ArrayDeque<>();
        private static Deque<Integer> p2 = new ArrayDeque<>();
        private static int TryNumber=0;

        public static void rec(){
            TryNumber+=1;
            if(p1.peekFirst()>p2.peekFirst()){
                if(p1.peekFirst()!=9 && p2.peekFirst()!=0) {
                    p1.addLast(p1.peekFirst());
                    p1.addLast(p2.peekFirst());
                }
                else{
                    p2.addLast(p2.peekFirst());
                    p2.addLast(p1.peekFirst());
                }
            }
            else {
                if(p2.peekFirst()==9 && p1.peekFirst()==0){
                    p1.addLast(p1.peekFirst());
                    p1.addLast(p2.peekFirst());
                }
                else{
                    p2.addLast(p2.peekFirst());
                    p2.addLast(p1.peekFirst());
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
                p1.addLast(n);
            }
            for(int i=0;i<5;i++){
                int n = scanner.nextInt();
                p2.addLast(n);
            }
            rec();
        }
}
