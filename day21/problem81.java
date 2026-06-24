package day21;

import java.util.Scanner;

public class problem81 {
    public static void main(String[] args) {
        System.out.println("Enter the string=");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int count = 0;

for (char c: name.toCharArray()) {
    System.out.println(c);
    count++;
}

System.out.println("The number of characters in string is "+count);
sc.close();
    }
}
