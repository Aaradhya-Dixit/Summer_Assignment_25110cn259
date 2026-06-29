package day26;

import java.util.Scanner;

public class problem102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name=");
        String name = sc.nextLine();
        System.out.print("Enter the age=");
        int age = sc.nextInt();
        if(age>=18){
            System.out.printf("Hello %s, You are eligible to use the right to vote.\n",name);
        }
        else{
            System.out.printf("Sorry %s, You are not eligible to vote.\n",name);
        }
        
        sc.close();
    }
}
