import  java.util.*;
public class three {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int[] a=new int[n];
        System.out.println("enter element");
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("array:");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
