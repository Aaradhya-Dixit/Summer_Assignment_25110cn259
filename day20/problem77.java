package day20;

import java.util.Scanner;

public class problem77 {
    public static void main(String[] args) {
         System.out.println("Enter the number of rows and columns of matrix=");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        int a[][]= new int[n][n];
        System.out.println("Enter the elements of matrix1=");
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int b[][]= new int[n][n];
        System.out.println("Enter the elements of matrix2=");
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                b[i][j]=sc.nextInt();
    }
}
int c[][]= new int[n][n];
for(int i =0;i<n;i++){
    for(int j=0;j<n;j++){
        c[i][j]=0;
        for(int k=0;k<n;k++){
            c[i][j]=c[i][j]+a[i][k]*b[k][j];
        }
    }
}
System.out.println("The multiplication of two matrices is=");
for(int i =0;i<n;i++){
    for(int j =0;j<n;j++){
     System.out.print(c[i][j]+" ");
    }
    System.out.println();
}
sc.close();
    }
}
