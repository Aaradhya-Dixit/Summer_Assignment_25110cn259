package day19;

import java.util.Scanner;

public class problem75 {
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
        int transpose[][]=new int[columns][rows];
for(int i =0;i<rows;i++){
    for(int j =0;j<columns;j++){
        transpose[i][j]=a[j][i];
    }
} 
System.out.println("The transpose of the matrix is=");
for(int i =0;i<rows;i++){
    for(int j=0;j<columns;j++){
        System.out.print(transpose[i][j]+" ");
    }
    System.out.println();
} 
sc.close();     


}
}
