package day3;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=2; i<n; i++){
            if (n%i==0) {
                c=c+1;
            }
        }
        if(c==0){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
        sc.close();
    }
}
