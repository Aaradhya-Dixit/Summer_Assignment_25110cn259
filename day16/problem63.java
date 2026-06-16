package day16;

import java.util.Scanner;

public class problem63 {
    public static void main(String[] args) {
         System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i =0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the required sum=");
        int sum=sc.nextInt();

for (int i = 0; i <size; i++) {
    for (int j = i + 1; j < size; j++) {
        if (a[i] + a[j] == sum) {
            System.out.printf("%d+%d=%d",a[i],a[j],sum);
        }
  
    }
}
sc.close();
    }
}
