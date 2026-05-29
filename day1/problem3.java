import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int product=1;
        while(i<=n){
            product=product*i;
            i++;

        }
    System.out.printf("The factorial of given number=%d",product);

    
sc.close();
        

    }
    
}
