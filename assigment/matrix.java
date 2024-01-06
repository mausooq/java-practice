import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        int i,j,c=0;
        System.out.println("enter row and column");
        int m=k.nextInt();
        int n=k.nextInt();
        System.out.println("enter number");
            int[][] a=new int[m][n];
            for (i = 0; i < m; i++) {
                for ( j = 0; j < n; j++) {
                    a[i][j]=k.nextInt();
                }

            }
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(a[i][j]+"  ");
                }
                System.out.println();
            }
            int prev=0,sum=0;
            for ( i = 0; i < m; i++) {
                for ( j = 0; j < n; j++) {
                    sum+=a[i][j];
                }
                if(sum>prev){
                    prev=sum;
                    c=i;
                }
                sum=0;
                

            }
            System.out.println(c);
            int old=0;sum=0;
            for ( j = 0; j < n; j++) {
                    for ( i = 0; i < m; i++) {
                    sum+=a[i][j];
                }
                if(sum>old){
                    old=sum;
                    c=j;
                }
                sum=0;
                

            }
            System.out.println(c);
    
}
}