package day26;

import java.util.Scanner;

public class problem103 {
    public static void main(String[] args) {
        int balance = 12000;
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println(" 1) Check Balance\n 2)Deposit Money\n 3)Withdraw Money\n 4) Exit");
        int choice= sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Balance available"+balance);
                break;
                case 2:
                    System.out.print("Enter the amount to be deposited=");
                    int deposit= sc.nextInt();
                    balance = balance+deposit;
                    break;
                case 3:
                    System.out.print("Enter the amount to be withdrawn=");
                    int withdrawl= sc.nextInt();
                    if(withdrawl>balance){
                        System.out.println("Insufficient balance");
                    }    
                    else{
                        balance = balance-withdrawl;
                        break;
                    }
                    case 4:
                        System.out.println("Thank You! Visit again.");
sc.close();
                        return;
        
            default:
                System.out.println("Invalid input");
                break;
        }
    }
   
    }
}
