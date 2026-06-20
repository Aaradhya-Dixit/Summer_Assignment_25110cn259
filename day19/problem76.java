package day19;

import java.util.Scanner;

public class problem76 {
    public static void main(String[] args) {
           System.out.println("Enter the number of rows and columns of matrix=");
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int columns = sc.nextInt();
        int a[][]= new int[rows][columns];
        System.out.println("Enter the elements of matrix1=");
        for(int i =0;i<rows;i++){
            for(int j =0;j<columns;j++){
                a[i][j]=sc.nextInt();
            }
        }
       int sum=0;
       for(int i =0;i<rows;i++){
        for(int j=0;j<columns;j++){
            if(i==j){
                sum=sum+a[i][j];
            }
        }
       }
       System.out.println("The diagonal sum of the matrix is="+sum);
sc.close();

    }
}
