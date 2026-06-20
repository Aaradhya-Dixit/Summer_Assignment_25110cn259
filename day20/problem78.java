package day20;

import java.util.Scanner;

public class problem78 {
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

for(int i =0;i<rows;i++){
    for(int j =0;j<columns;j++){
        if(a[i][j]==transpose[i][j]){
            continue;
        }
        else{
            System.out.println("The matrix is not symmetric");
            sc.close();
            return;
        }
    }
}

System.out.println("The matrix is symmetric");

sc.close();
    }
}
