package day4;

import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=n;
        int c =0;
        while(n!=0){
            c=c+1;
           n= n/10;

        }
        int n2=n1;
        int r=0;
int s=0;
while(n1!=0){
r=n1%10;
s=s+(int)Math.pow(r,c);
n1=n1/10;
}
if (n2==s) {
    System.out.println("The number is Armstrong number");
    
}
else{
    System.out.println("The number is not an Armstrong number");
}
sc.close();
    }
}
