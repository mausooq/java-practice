public class ass1{
    public static void main(String[] args) {
        int[] a={7,12,9,36,54,26,96,45};
        int n=a.length;
        System.out.println("array:");
        for (int i=0;i<8;i++){
                             System.out.print(a[i]+" ");   

        }
        for (int i=0;i<n;i++){
            if(a[i]>a[i-1]){
                if (a[i]>a[i+1]){
                System.out.println(a[i]+"");
            }
                    
    }
}
}
}