package day14;

import java.util.Scanner;

public class problem54 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i = 0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element whose frequency is to be found=");
        int element=sc.nextInt();
        int frequency=0;
        for(int i=0;i<size;i++){
        if(a[i]==element){
          frequency=frequency+1;
        }
        }
        if(frequency==0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("The frequency of the given element is "+frequency);
        }
        sc.close();

    }
}
