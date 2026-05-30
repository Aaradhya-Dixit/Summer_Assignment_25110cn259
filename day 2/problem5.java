import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r;
        int sum=0;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.printf("The sum of digits of given number is %d",sum);

        sc.close();
    }
    
}
