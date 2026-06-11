package day11;

import java.util.Scanner;

public class problem42 {
    public static void maximum(int a,int b){
        if (a>b) {
            System.out.println("Maximum="+a);
        }
        else{System.out.println("Maximum="+b);}
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers=");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        maximum(a, b);
        sc.close();
    }
}
