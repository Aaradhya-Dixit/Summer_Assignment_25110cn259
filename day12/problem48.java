package day12;

import java.util.Scanner;

public class problem48 {
    public static int perfectNum(int n ){
         int sum=0;
        for (int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
    }
    return sum;

}
public static void main(String[] args) {
    System.out.println("Enter the number=");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (perfectNum(n)==n) {
        System.out.println("Perfect number");

    }
    else{System.out.println("Not a perfect number");}
    sc.close();
}
}
