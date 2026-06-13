package day13;

import java.util.Scanner;

public class problem51 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array= ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[]= new int[size];
        for(int i =0;i<size;i++){
            array[i]=sc.nextInt();
        } 
        int min=array[0];
        int max=array[0];
        for(int i=1;i<size;i++){
            if(min>array[i]){
            min=array[i];
            }
            else if(max<array[i]){
                max=array[i];
            }
        }
        System.out.printf("Maximum=%d\nminimum=%d",max,min);
        sc.close();
    }
}
