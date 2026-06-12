package day12;

import java.util.Scanner;

public class problem46 {
    public static int checkArmstrong(int n){
        int c =0;
        int n1=n;
        int rev=0;
        while(n!=0){
            n=n/10;
            c=c+1;
        }
        
        int sum=0;
        while(n1!=0){
        rev=n1%10;
        sum=sum+(int)Math.pow(rev,c);
        n1=n1/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if (checkArmstrong(n)==n) {
            System.out.println("The number is an Armstrong number");
        }
        else{
            System.out.println("The number is not an Armstrong number");
        }
        sc.close();
    }
}
