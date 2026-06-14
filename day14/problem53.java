package day14;

import java.util.Scanner;

public class problem53 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i =0;i<size;i++){
        a[i]=sc.nextInt();
        }
        System.out.println("Element to search from array=");
        int location=-1;
        int element=sc.nextInt();
        for(int i =0;i<size;i++){
            if(a[i]==element){
            location=i+1;
            break;
            }
        }
        if(location==-1){
        System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at location="+location);
        }
        sc.close();
    }
}
