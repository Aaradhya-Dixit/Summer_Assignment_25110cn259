package day16;

import java.util.Scanner;

public class problem64 {
   public static void main(String[] args) {
     System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i =0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
    for (int j = 0; j < size - 1 - i; j++) {
        if (a[j] > a[j + 1]) {
            int temp = a[j];
            a[j] = a[j + 1];
            a[j + 1] = temp;
        }
    }
}
int j = 0;

for (int i = 0; i <size - 1; i++) {
    if (a[i] != a[i + 1]) {
        a[j] = a[i];
        j++;
    }
}

a[j] = a[size - 1];
j++;

System.out.println("Array after removing duplicates:");
for (int i = 0; i < j; i++) {
    System.out.print(a[i] + " ");
}
sc.close();

   } 
}
