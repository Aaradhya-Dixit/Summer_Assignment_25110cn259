package day10;

import java.util.Scanner;

public class problem40 {
     public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space;
        int i;
        
        for( i=1;i<=n;i++){
           
            for( space = 1; space<=n-i;space++){
                System.out.print(" ");
            }
            for( char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            
            }
            for(char ch=(char)('A'+i-2);ch>='A';ch--){
System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
