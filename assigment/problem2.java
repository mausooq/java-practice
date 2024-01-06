import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int prev=0,ne=0,max=0,flag=0,cnt;
        for (int i = 0; i < n; i++) {
            cnt=0;
            flag=0;
            for (int j = 0; j < n; j++) {
                if(arr[i]==arr[j]){
                    cnt++;
                }
                if(i==0){
                    if(prev==cnt){
                    prev=cnt;  
                    flag=1;                  
                }
                }else{
                    prev=cnt;
                }
                
                
            }
            
        }
        if(flag==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    
}
