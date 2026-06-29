package day26;

import java.util.Scanner;

public class problem104 {
public static void main(String[] args) {
    int score=0;
    System.out.println("What is the capital of Italy?\n1)Austria\n2)Rome\n3)Athens\n4)Milan");
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    if(n==2){
        score=score+10;
    }
    System.out.println("How many planets are there in the solar system?\n1)Three\n2)Five\n3)Eight\n4)Nineteen");
    int m=sc.nextInt();
    if(m==3){
        score=score+10;
    }
    System.out.println("Who invented the telephone?\n1)Alexander Graham Bell\n2)Nikola Tesla\n3)Galilio Galilei\n4)Some random guy");
    int o =sc.nextInt();
    if(o==1){
        score+=10;
    }
    System.out.println("The largeset ocean on earth is?\n1)Atlantic Ocean\n2)Indian Ocean\n3)Pacific Ocean\n4)Arctic Ocean");
    int p=sc.nextInt();
    if(p==3){
        score+=10;
    }
    System.out.println("What is japanese of 'Welcome home'\n1)Ganbare\n2)Gomen nasai\n3)Arigato\n4)Irasahaimasen");
    int q=sc.nextInt();
    if(q==4){
        score+=10;
    }
    System.out.println("You achieved "+score+" out of 50");
    sc.close();
}
}
