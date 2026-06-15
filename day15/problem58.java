package day15;

import java.util.Scanner;

public class problem58 {
     public static void main(String[] args) {
         System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i = 0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int first = a[0];

for (int i = 0; i < size - 1; i++) {
    a[i] = a[i + 1];
}

a[size - 1] = first;
for(int i =0;i<size;i++){
     System.out.print(a[i] + " ");
}
sc.close();
}
}