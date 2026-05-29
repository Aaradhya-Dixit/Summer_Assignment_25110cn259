import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        System.out.println("Enter the number=");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        while(n>0){
             n=n/10;
            count=count+1;
        }
      System.out.printf("The number of digits in the number are %d",count);
      sc.close();

    }
  
}
