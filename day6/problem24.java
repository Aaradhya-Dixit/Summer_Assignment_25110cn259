package day6;

import java.util.Scanner;

public class problem24 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers=");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int n =sc.nextInt();
        int r=1;
        while(n>0){
            r=r*x;
            n--;
        }
        System.out.println("The value of x^n is "+r);
        sc.close();
    }
}
