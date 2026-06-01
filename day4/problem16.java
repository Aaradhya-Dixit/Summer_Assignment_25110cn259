package day4;

import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers=");
        Scanner sc = new Scanner(System.in);
        int n1 = sc. nextInt();
int n2 = sc.nextInt();


System.out.printf("The Armstrong numbers from %d to %d are\n",n1,n2);
for(int i= n1; i<=n2;i++){
    int c=0;
    int i1=i;
    int i2=i;
    while(i2!=0){
     
        c=c+1;
        i2=i2/10;
    }
    int r=0;
    int s=0;
    
  while(i1!=0){
r=i1%10;
s=s+(int)Math.pow(r, c);
i1=i1/10;
    }
    if(s==i){
        System.out.println(s);
    }
}
sc.close();

    }
}
