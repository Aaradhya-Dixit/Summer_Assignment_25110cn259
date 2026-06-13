package day13;

import java.util.Scanner;

public class problem52 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array=");
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int a[]= new int[size];
        for(int i=0;i<size;i++){
         a[i]=sc.nextInt();
        }
        int even=0;int odd=0;
        for(int i=0;i<size;i++){
            if(a[i]%2==0){
                even=even+1;
            }
            else{
                odd=odd+1;
            }
        }
        System.out.printf("The even and odd number in the array are %d and %d ",even,odd);
        sc.close();
    }
}
