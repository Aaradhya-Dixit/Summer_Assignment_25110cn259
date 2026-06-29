import java.util.Scanner;

public class problem99 {
    public static void main(String[] args) {
        System.out.println("Enter the number of names=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String names[] = new String[n];
        System.out.println("Enter the names=");
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1 - i; j++) {
                if (names[j].compareTo(names[j+1]) > 0) {
                    // swap
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
sc.close();
    }
}
