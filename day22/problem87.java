package day22;

import java.util.Scanner;

public class problem87 {
    public static void main(String[] args) {
        System.out.println("Enter the string=");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter the character=");
        char ch= sc.next().charAt(0);
        int frequency =0;
        for(int i =0;i<name.length();i++){
            if(name.charAt(i)==ch){
                frequency = frequency+1;
            }
        }
        System.out.printf("The frequency of %c is %d",ch,frequency);
       sc.close();
    }
}
