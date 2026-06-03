package day6;

import java.util.Scanner;

public class problem23 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while(n>0){
          if(n%2==1){
            count=count+1;
          }
          n=n/10;
        }
        System.out.println("The number of set bits in the number are="+count);
        sc.close();

    }
}
