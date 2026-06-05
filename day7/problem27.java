package day7;

import java.util.Scanner;

public class problem27 {
    public static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        return(n%10)+sumofdigits(n/10);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum of digits is="+sumofdigits(n));
        sc.close();
    }
}
