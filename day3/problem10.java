package day3;

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      System.out.printf("THE PRIME NUMBERS UPTO %d are=",n);
        for (int i=2;i<=n;i++){
            int c=0;
            for(int j =1;j<=i;j++){
                if (i%j==0) {
                    c=c+1;
                }
            }
            if(c==2){
                System.out.println(i);
               
            }
        }
        sc.close();
    }
}
