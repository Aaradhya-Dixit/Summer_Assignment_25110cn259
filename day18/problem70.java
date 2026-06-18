package day18;

import java.util.Scanner;

public class problem70 {
    public static void main(String[] args) {
         System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        System.out.println("Enter the elements of array=");
        for(int i =0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Sort array using selection sort=");
        for(int i=0;i<size-1;i++){
            int min =i;
            for(int j=i+1;j<size;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
           int temp=a[i];
            a[i]=a[min];
            a[min]=temp;

        }
        for(int i =0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
