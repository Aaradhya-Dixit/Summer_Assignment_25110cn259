package day19;

import java.util.Scanner;

public class problem73 {
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
        int b[][]= new int[rows][columns];
        System.out.println("Enter the elements of matrix2=");
        for(int i =0;i<rows;i++){
            for(int j =0;j<columns;j++){
                b[i][j]=sc.nextInt();
    }
}
int sum[][]=new int[rows][columns];
for(int i=0;i<rows;i++){
    for(int j=0;j<columns;j++){
        sum[i][j]=a[i][j]+b[i][j];
    }
}
System.out.println("The sum of the two matrices are=");
for(int i=0;i<rows;i++){
    for(int j=0;j<columns;j++){
        System.out.print(sum[i][j]+" ");
    }
    System.out.println();
}
sc.close();
    }
}

