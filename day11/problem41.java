package day11;

import java.util.Scanner;

public class problem41 {
    public static void sumTwoNumbers(int a, int b){
        System.out.println("Sum of the two numbers is "+(a+b));
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers=");
        Scanner sc = new Scanner( System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        sumTwoNumbers(a, b);
        sc.close();
    }
    
}
