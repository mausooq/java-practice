import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int prev=0,ne=0,max=0;
        for (int i = 0; i < n; i++) {
            int cnt=0;
            for (int j = 0; j < n; j++) {
                if(arr[i]==arr[j]){
                    cnt++;
                }
                ne=arr[i]*cnt;
                if(prev<ne){
                    prev=ne;
                    max=arr[i];
                }
            }
            
        }
        System.out.println(max);
    }
}
