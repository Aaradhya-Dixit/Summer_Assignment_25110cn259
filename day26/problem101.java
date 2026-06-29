package day26;

import java.util.Scanner;

public class problem101 {
    public static void main(String[] args) {
        int random = (int)(Math.random()*100)+1;
        System.out.println("Guess the number=");
        int n=0;
        Scanner sc = new Scanner(System.in);
        while(random!=n){
            n=sc.nextInt();
            if(n==random){
                System.out.println("Congratulations! You guessed right");
                break;
            }
        else if(n>random){
        System.out.println("Too high!");
        }
        else{
            System.out.println("Too low");
        }
      }
        sc.close();
        }
     }

