package day11;

import java.util.Scanner;

public class problem43 {
    public static void primeNumber(int n){
        int c=0;
        for (int i =1;i<=n;i++){
            if(n%i==0){
                c=c+1;
            }
        }
        if(c==2){System.out.println("Prime number");}
        else{
            System.out.println("Not a prime number");
        }
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeNumber(n);
        sc.close();
    }
}
