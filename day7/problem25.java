package day7;

import java.util.Scanner;

public class problem25 {
    public static int recursivefactorial (int n){
        if (n==1) {
            return 1;
        }
        return n*recursivefactorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int result =recursivefactorial(n);
        System.out.println("The factorial of the number is "+result);
        sc.close();
    }
}
