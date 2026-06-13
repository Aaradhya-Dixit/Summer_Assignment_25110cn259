package day13;

import java.util.Scanner;

public class problem50 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array=");
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int array[]= new int[size];
        int sum=0;
        for(int i =0;i<size;i++){
            array[i]= sc.nextInt();
            sum=sum+array[i];
        }
        float avg= sum/(float)size;
        System.out.printf("The sum and average of the array is %d and %.2f.",sum,avg);
        sc.close();
    }
}
