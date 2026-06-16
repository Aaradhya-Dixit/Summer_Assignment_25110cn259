package day16;

import java.util.Scanner;

public class problem62 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i =0;i<size;i++){
            a[i]=sc.nextInt();
        }

int Freq = 0;
int Element = a[0];

for (int i = 0; i < size; i++) {
    int count = 0;

    for (int j = 0; j <size; j++) {
        if (a[i] == a[j]) {
            count++;
        }
    }

    if (count > Freq) {
        Freq = count;
        Element = a[i];
    }
}

System.out.printf("Element with maximum frequency is %d with frequency of %d",Element,Freq);
sc.close();
    }
}
