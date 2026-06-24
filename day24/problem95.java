package day24;

import java.util.Scanner;

public class problem95 {
    public static void main(String[] args) {
        System.out.println("Enter the string=");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String longest = "";
        String current = "";

for(int i = 0; i < str.length(); i++) {

    if(str.charAt(i) != ' ') {
        current += str.charAt(i);
    }
    else {
        if(current.length() > longest.length()) {
            longest = current;
        }
        current = "";
    }
}


if(current.length() > longest.length()) {
    longest = current;
}

System.out.println("The longest word is "+longest);
sc.close();
    }
}
