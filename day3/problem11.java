package day3;

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers=");
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int a1=n1;
        int a2=n2;
        for(int i=0; i<=n1; i++){
            int p = a1%a2;
            if(a1%a2==0){
               break;
            }
            else{
                a1=a2;
                a2=p;
            }
        }
         System.out.printf("The GCD of %d and %d is %d",n1,n2,a2);
        sc.close();

    }
}
