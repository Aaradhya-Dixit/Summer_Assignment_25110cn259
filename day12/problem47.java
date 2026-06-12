package day12;

import java.util.Scanner;

public class problem47 {
    public static void fibonacci(int n ){
        int a1=0;
        int a2=1;
        int sum=0;
        while(n!=0){
        sum=a1+a2;
        a1=a2;
        a2=sum;
        System.out.println(sum);
        n--;
        }
        return;

    }
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci series=0\n1");
        fibonacci(n);
        sc.close();
    }
}
