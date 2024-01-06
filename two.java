public class two {
    public static void main(String[] args) {
        // int[][] arr=new int[5][9];
        int i=0, j=0, k=0, step = 9,l=0;
        while( i < 5) {
           while(j <= i) {
                System.out.print("* ");
                 j++;
            }
            step = step - 2;
            while( k < step) {
                System.out.print("  ");
                k++;
            }
             for (l = 0; l <= i; l++) {
                System.out.print("* ");
                
                if(l==3){
                    break;
                }
                
            }
            System.out.println();
            i++;
        }
    }
}
