package day5;

import java.util.Scanner;

public class problem20 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r=0;
for (int i=2;i<=n;i++){
    int c=0;
    for(int j=1;j<=i;j++){
        if(i%j==0){
            c=c+1;
        }
    }
    if(c==2&&n%i==0){
        r=i;

    }
}
System.out.printf("The largest prime factor of %d is %d",n,r);
sc.close();
    }
}
