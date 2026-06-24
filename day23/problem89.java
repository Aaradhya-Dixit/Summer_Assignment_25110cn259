package day23;

import java.util.Scanner;

public class problem89 {
    public static void main(String[] args) {
        System.out.println("Enter the string=");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(int i =0;i<name.length();i++){
            int frequency=0;
            for(int j=0;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)){
                    frequency=frequency+1;
                }
                
            }
            if (frequency == 1){
                    System.out.println("The non repeating character is "+name.charAt(i));
                    sc.close();
                    return;
                }
        }
        sc.close();
    }
}
