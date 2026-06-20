package day20;

import java.util.Scanner;

public class problem79 {
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
        for(int i =0;i<rows;i++){
            int sum=0;
            for(int j=0;j<columns;j++){
                sum=sum+a[i][j];
               
            }
             System.out.printf("The sum of row %d is %d\n",i+1,sum);
           
        }
        sc.close();
    }
}
