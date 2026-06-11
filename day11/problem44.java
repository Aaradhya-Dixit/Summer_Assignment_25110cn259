package day11;

import java.util.Scanner;

public class problem44 {
    public static void factorial(int n ){
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        System.out.println("The factorial of the number is "+fact);
        return;

    }
    public static void main(String[] args) {
        System.out.println("enter the number=");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       factorial(n); 
       sc.close();
    }
}
