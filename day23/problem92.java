package day23;

import java.util.Scanner;

public class problem92 {
    public static void main(String[] args) {
        System.out.println("Enter the string=");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int max=0;
       char ch='a';
        for(int i =0;i<name.length();i++){
            int frequency=0;
            for(int j=0;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)){
                    frequency=frequency+1;
                }
            }
            if(max<frequency){
                max=frequency;
              ch=name.charAt(i);
            }
        }
        System.out.printf("The character with highest frequency is %c with frequency of %d",ch,max);
        sc.close();
    }
}
