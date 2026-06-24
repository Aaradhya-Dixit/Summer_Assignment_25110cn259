package day23;

import java.util.Scanner;

public class problem91 {
    public static void main(String[] args) {
        System.out.println("Enter string 1st=");
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        System.out.println("Enter string 2nd=");
        String str2 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        for (int i =0;i<sb1.length();i++){
            if(sb1.charAt(i)==' '){
                sb1.delete(i, i+1);
            }
    }
     for (int i =0;i<sb2.length();i++){
            if(sb2.charAt(i)==' '){
                sb2.delete(i, i+1);
            }
    }
    if(sb1.length()!=sb2.length()){
        System.out.println("Not an anagram string");
       sc.close();
       return;
    }
    for(int i =0;i<sb1.length();i++){
        int frequency1 =0;
        int frequency2=0;
        char ch = sb1.charAt(i);
        for(int j=0;j<sb1.length();j++){
            if(ch==sb1.charAt(j)){
                frequency1=frequency1+1;
            }
            if(ch==sb2.charAt(j)){
                frequency2=frequency2+1;
            }
        }
        if(frequency1!=frequency2){
            System.out.println("not an anagram string");
            sc.close();
            return;
        }
        
        }
        System.out.println("The string is anagram");
        sc.close();
  

}
}
