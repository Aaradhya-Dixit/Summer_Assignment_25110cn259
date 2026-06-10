package day10;

import java.util.Scanner;

public class problem37 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space;
        int i;
        int j;
        for( i=1;i<=n;i++){
           
            for( space = 1; space<=n-i;space++){
                System.out.print(" ");
            }
            for( j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
