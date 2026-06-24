package day21;

import java.util.Scanner;

public class problem82 {
    public static void main(String[] args) {
        System.out.println("Enter the string=");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
    String rev = "";

for (int i = name.length() - 1; i >= 0; i--) {
    rev = rev + name.charAt(i);
}

System.out.println(rev);
sc.close();
    }
}
