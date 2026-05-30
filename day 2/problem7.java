import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int product=1;
        int r;
        while(n>0){
        r=n%10;
        product=product*r;
        n=n/10;
        }
        System.out.printf("The product of the digits is %d",product);
         sc.close();
        

    }
    
}
