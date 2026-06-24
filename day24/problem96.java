package day24;

import java.util.Scanner;

public class problem96 {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

for (int i = 0; i < str.length(); i++) {

    char ch = str.charAt(i);
    int j;

    for (j = 0; j < result.length(); j++) {
        if (result.charAt(j) == ch) {
            break;
        }
    }

    if (j == result.length()) {
        result += ch;
    }
}

System.out.println(result);
sc.close();
        
        
    }
}
