package day5;

import java.util.Scanner;

public class problem18 {
    public static int factorial(int n){
        int fact=1;
        for(int i =n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int sum=0;
        int n1=n;
        while(n!=0){
            r=n%10;
            sum= sum +factorial(r);
            n=n/10;

        }
        if (sum==n1) {
            System.out.println("The number is a strong number");
            
        }
        else{
            System.out.println("The number is not a strong number");
        }
        sc.close();
    }
    
}
