package day12;

import java.util.Scanner;

public class problem45 {
    public static int reverse(int n){
        int rev=0;
        int sum=0;
        while(n!=0){
        rev=n%10;
        sum=sum*10+rev;
        n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       if (reverse(n)==n) {
        System.out.println("The given number is a palindrome");
       }
       else{
        System.out.println("The number is not a palindrome");
       }
       sc.close();
    }
}
