package day21;

import java.util.Scanner;

public class problem84 {
    public static void main(String[] args) {
        System.out.println("Enter the string=");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        for (int i = 0; i < name.length(); i++) {
            char ch = Character.toUpperCase(name.charAt(i));
         sb.setCharAt(i, ch);
        }
        System.out.print(sb);
        sc.close();

    }
}
