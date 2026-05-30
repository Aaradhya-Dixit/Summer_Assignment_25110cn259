import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r;
        int reverse=0;
       while(n>0){
            r=n%10;
            reverse=reverse*10+r;
            n=n/10;

        }
        System.out.printf("The reverse of the number is%d",reverse);
         sc.close();
    }
}
      