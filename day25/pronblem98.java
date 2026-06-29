import java.util.Scanner;

public class pronblem98 {
    public static void main(String[] args) {
        System.out.println("Enter the string 1");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        System.out.println("Enter the string 2");
        String str2 = sc.nextLine();
        System.out.println("Common characters are=");
        for (int i =0;i<sb1.length();i++){
            if(sb1.charAt(i)==' '){
                sb1.delete(i, i+1);
            }
        }
        for(int i =0;i<sb1.length();i++){
            char c =sb1.charAt(i);
             if(str2.indexOf(c)!=-1){
                System.out.print(c+" ");
             }
        }
        sc.close();
    }
}
