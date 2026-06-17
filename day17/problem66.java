package day17;

import java.util.Scanner;

public class problem66 {
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
        for (int i = 0; i < n1; i++) {
    System.out.print(arr1[i] + " ");
}

for (int i = 0; i < n2; i++) {
    int count = 0;

    for (int j = 0; j <n1; j++) {
        if (arr2[i] == arr1[j]) {
            count++;
        }
    }

    if (count == 0) {
        System.out.print(arr2[i] + " ");
    }
}
sc.close();
    }
}
