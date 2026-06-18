package day18;

import java.util.Scanner;

public class problem69 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        System.out.println("Enter the elements of array=");
        for(int i =0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Sort the array using bubble sort");
        for(int i =1;i<size;i++){
            for (int j=0;j<size-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i =0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
