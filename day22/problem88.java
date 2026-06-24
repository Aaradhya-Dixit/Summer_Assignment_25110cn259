package day22;

import java.util.Scanner;

public class problem88 {
    public static void main(String[] args) {
        System.out.println("Enter the string=");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        for (int i =0;i<sb.length();i++){
            if(sb.charAt(i)==' '){
                sb.delete(i, i+1);
            }
        }
        System.out.print(sb);
        sc.close();
    }
}
