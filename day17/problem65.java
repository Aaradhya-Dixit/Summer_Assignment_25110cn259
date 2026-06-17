package day17;

import java.util.Scanner;

public class problem65 {
    public static void main(String[] args) {
        System.out.println("Enter the size of first array=");
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int arr1[]= new int[n1];
         System.out.println("Enter the elements of array1=");
         for(int i = 0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of second array=");
        int n2= sc.nextInt();
        int arr2[]= new int[n2];
         System.out.println("Enter the elements of array2=");
        for(int i = 0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int[] merged = new int[n1 + n2];

for (int i = 0; i < n1; i++) {
    merged[i] = arr1[i];
}

for (int i = 0; i <n2; i++) {
    merged[n1 + i] = arr2[i];
}

for (int i = 0; i < n1+n2; i++) {
    System.out.print(merged[i] + " ");

    }
    sc.close();
}
}
