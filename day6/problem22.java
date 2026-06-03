package day6;

import java.util.Scanner;

public class problem22 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int dec=0;
        int i=0;
     while(n>0){
        r=n%10;
        dec=dec+(int)r*Math.powExact(2,i);
        i++;
        n=n/10;
     }
     System.out.println(dec);
     sc.close();
    }
}
