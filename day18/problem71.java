package day18;

import java.util.Scanner;

public class problem71 {
    public static void main(String[] args) {
         System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        System.out.println("Enter the elements of array=");
        for(int i =0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be found=");
        int element= sc.nextInt();
        int beg=0;
        int end=size-1;
        int mid=(beg+end)/2;
        while(beg<=end&&element!=a[mid]){
          if(element<a[mid]){
            end=mid-1;
          }
           else if(element>a[mid]){
            beg=mid+1;
        }
        mid=(beg+end)/2;
        }
        if(element==a[mid]){
            System.out.printf("Element found at %d location",mid+1);
        }
        else{
            System.out.println("Search unsuccessful ");
        }
        sc.close();
       
    }
}
