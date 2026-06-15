package day15;

import java.util.Scanner;

public class problem59 {
    
     public static void main(String[] args) {
         System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i = 0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int last = a[size - 1];

for (int i = size - 1; i > 0; i--) {
    a[i] = a[i - 1];
}

a[0] = last;

for (int i = 0; i < size; i++) {
    System.out.print(a[i] + " ");
}
sc.close();
}
}
