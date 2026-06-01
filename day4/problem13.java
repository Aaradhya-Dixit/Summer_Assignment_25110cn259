package day4;

import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1= 0;
        int a2= 1;
        System.out.printf("The Fibonacci series is %d\n%d\n",a1,a2);
        for(int i =0; i<=n;i++){
            int s= a1+a2;
            a1=a2;
            a2=s;
            System.out.println(s);
        }
        sc.close();
    }
}
