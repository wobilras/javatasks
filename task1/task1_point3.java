package ru.mirea.task1;

public class task1_point3 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        int i=0,sum=0;
        while(i<5) {
            sum+=arr[i];
            i++;
        }
        System.out.print(sum);
        System.out.println(" ");
        i=0;
        sum=0;
        do{
            sum+=arr[i];
            i++;
        }while(i<5);
        System.out.print(sum);
        System.out.println(" ");
        sum=0;
        for(int j=0;j<5;j++){
            sum+=arr[j];
        }
        System.out.print(sum);
    }
}


