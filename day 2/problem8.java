import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r;
        int reverse=0;
        int n1=n;
         while(n1>0){
            r=n1%10;
            reverse=reverse*10+r;
            n1=n1/10;
         }
         if(n==reverse){
            System.out.println("The given number is a palindrome");
         }
         else{
            System.out.println("The number is not a palindrome");
         }
         sc.close();

    }
    
}
