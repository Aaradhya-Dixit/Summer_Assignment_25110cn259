package day22;

import java.util.Scanner;

public class problem85 {
    public static void main(String[] args) {
        System.out.println("Enter the string=");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(int i =0;i<name.length()/2;i++){
            int front = i;
            int back = name.length()-1-i;
            char frontChar= name.charAt(front);
            char backChar = name.charAt(back);
            if(frontChar!=backChar){
                System.out.println("The string is not a palindrome");
                sc.close();
                return;
            }

        }
        System.out.println("The string is a palindrome");
        sc.close();  
            
    }
}
