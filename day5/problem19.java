package day5;

import java.util.Scanner;

public class problem19 {
    public static void printfactors(int n){
        for(int i =1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printfactors(n);
        sc.close();
    }
}
