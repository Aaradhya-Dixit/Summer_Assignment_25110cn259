
import java.util.Scanner;

public class problem97 {
    public static int[] merge(int a[], int b[]) {
        int result[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                result[k++] = a[i++];
            else
                result[k++] = b[j++];
        }

        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array 1 =");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the size of array 2 =");
        int m = sc.nextInt();
        int b[]= new int[m];
        System.out.println("Enter the elements of array 1");
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of array 2");
        for(int i =0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int result[]= merge(a, b);
       for(int i =0;i<m+n;i++){
        System.out.println(result[i]+" ");
       }
       sc.close();

    }
}
