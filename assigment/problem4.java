import java.util.Scanner;
import java.util.Arrays;
public class problem4 {
    public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
    }
        int arr1[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i]=in.nextInt();
    }
    Arrays.sort(arr);
    Arrays.sort(arr1);
    int flag=0;
    for (int i = 0; i < n; i++) {
        flag=0;
        if(arr[i]==arr1[i]){
            flag=1;
        }
    }
    System.out.println(flag);
}
}
