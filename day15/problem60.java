package day15;

import java.util.Scanner;

public class problem60 {
        public static void main(String[] args) {
         System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i = 0;i<size;i++){
            a[i]=sc.nextInt();
        }
         int j = 0;

        for (int i = 0; i < size; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }

        }
        for (int i = 0; i < size; i++) {
    System.out.print(a[i] + " ");
}
sc.close();
        }
    }

