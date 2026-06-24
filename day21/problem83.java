package day21;

import java.util.Scanner;

public class problem83 {
    public static void main(String[] args) {
        System.out.println("Enter the string=");
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
         int count = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = Character.toLowerCase(name.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels = " + count);
        sc.close();

    }
}
