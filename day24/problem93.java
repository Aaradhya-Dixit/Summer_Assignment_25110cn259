package day24;

import java.util.Scanner;

public class problem93 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not a rotation");
            sc.close();
            return;
        }

        String temp = str1 + str1;

        if (temp.contains(str2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not a rotation");
        }

        sc.close();
    }
}
