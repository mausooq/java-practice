import java.util.Scanner;

public class execption{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int[] a=new int[n];
        System.out.println("enter element");
        for (int i = 0; i < n ; i++) {
            a[i]=in.nextInt();
            }
        System.out.println("array");
        for (int i = 0; i < 6; i++) {
            try{
            System.out.println(a[i]+" ");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(" exception ouccer here");
            }
    }
}
}