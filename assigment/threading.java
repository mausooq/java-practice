class mythread extends Thread{
    public void run(){
        int i=0;
        while(i<100)
        {
                System.out.println("hello world");
                i++;
        }
    }
}
class mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<100)
        {
                System.out.println("hello world !!!!!!!!!!");
                                i++;

        }
    }
}
public class threading {
    public static void main(String[] args) {
        mythread t1 =new mythread();
        mythread1 t2 =new mythread1();
        t2.setPriority(6);
        t1.start();
        t2.start();
        
    }
}
