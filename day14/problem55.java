package day14;

import java.util.Scanner;

public class problem55 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i =0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        int secondMax=0;
        for(int i=0;i<size;i++){
        if(max<a[i]){
                secondMax=max;
                max=a[i];
            }
         }
         System.out.println("The 2nd largest element in the array is "+secondMax);
         sc.close();
    }
}
