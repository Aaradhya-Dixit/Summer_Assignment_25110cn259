import java.util.Scanner;

public class problem100 {
    public static void main(String[] args) {
      System.out.println("Enter the number of words=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        System.out.println("Enter the words=");
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }   
        
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].length() > words[j+1].length()) {
                    // swap
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        sc.close();
    }
}
