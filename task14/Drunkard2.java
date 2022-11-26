package ru.mirea.task14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Drunkard2 {
        private static Queue<Integer> p1 = new LinkedList<>();
        private static Queue<Integer> p2 = new LinkedList<>();
        private static int TryNumber=0;

        public static void rec(){
            TryNumber+=1;
            if(p1.element()>p2.element()){
                if(p1.element()!=9 && p2.element()!=0) {
                    p1.offer(p1.remove());
                    p1.offer(p2.remove());
                }
                else{
                    p2.offer(p2.remove());
                    p2.offer(p1.remove());
                }
            }
            else {
                if(p2.element()==9 && p1.element()==0){
                    p1.offer(p1.remove());
                    p1.offer(p2.remove());
                }
                else{
                    p2.offer(p2.remove());
                    p2.offer(p1.remove());
                }
            }
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
                p1.offer(n);
            }
            for(int i=0;i<5;i++){
                int n = scanner.nextInt();
                p2.offer(n);
            }
            rec();
        }
}
