package day6;

import java.util.Scanner;

public class problem21 {
    
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int binary=0;
        int lim=1;
        while(n>0){
            binary=binary+(n%2)*lim;
            lim=lim*10;
            n=n/2;
        }
       System.out.println(binary);
sc.close();
    }
}
