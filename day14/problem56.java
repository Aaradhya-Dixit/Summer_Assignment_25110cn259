package day14;

import java.util.Scanner;

public class problem56 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i = 0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(int i = 0;i<size; i++) {
    for(int j = i + 1; j < size; j++) {
        if(a[i] == a[j]) {
            System.out.println("Diplicate in array is "+a[i]);
            break;
        }
    }
}

    }
}
