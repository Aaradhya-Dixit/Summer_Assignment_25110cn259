package day20;

import java.util.Scanner;

public class problem80 {
     public static void main(String[] args) {
         System.out.println("Enter the number of rows and columns of matrix=");
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int columns = sc.nextInt();
        int a[][]= new int[rows][columns];
        System.out.println("Enter the elements of matrix=");
        for(int i =0;i<rows;i++){
            for(int j =0;j<columns;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<columns;i++){
            int sum=0;
            for(int j=0;j<rows;j++){
                sum=sum+a[j][i];
               
            }
             System.out.printf("The sum of column %d is %d\n",i+1,sum);
           
        }
        sc.close();
    }
}
