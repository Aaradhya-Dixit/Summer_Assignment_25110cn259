package day4;

import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = 0;
        int a2 = 1;
        int s=0;
        for(int i = 0; i<=n; i++){
        
            s = a1+a2;
            a1=a2;
            a2=s;
        }
        System.out.printf(" The %dth term of Fibonacci series is %d",n,s);
        sc.close();
    }
    
}
