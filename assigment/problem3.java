import java.util.Scanner;
import java.util.Arrays;
public class problem3 {
    public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("enter K");
        int k=in.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
