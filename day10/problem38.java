package day10;

import java.util.Scanner;

public class problem38 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int space=1;space<=i-1;space++){
                System.out.print(" ");                
            }
            for(int j = 1;j<=2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }sc.close();
    }
}
