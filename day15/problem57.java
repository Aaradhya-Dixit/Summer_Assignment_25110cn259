package day15;

import java.util.Scanner;

public class problem57 {
    public static void main(String[] args) {
         System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i = 0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int start = 0;
        int end =size - 1;

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
