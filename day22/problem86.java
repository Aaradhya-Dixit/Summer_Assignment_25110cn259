package day22;

import java.util.Scanner;

public class problem86 {
    public static void main(String[] args) {
        System.out.println("Enter the string=");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int words=1;
        for(int i =0;i<name.length();i++){
            if(name.charAt(i) == ' '){
                words=words+1;

            }

        }
        System.out.println("Words="+words);
        sc.close();
    }
}
