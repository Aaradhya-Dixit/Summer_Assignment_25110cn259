package day7;

import java.util.Scanner;

public class problem28 {
     static int rev =0;
    public static void reverse(int n){
    if(n==0){
        return ;
    }
    rev = rev*10+(n%10);
    reverse(n/10);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
        System.out.println("The reverse of the number is "+rev);
        sc.close();
    }
}
