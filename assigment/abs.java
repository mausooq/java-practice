// abstract class sample{
//     abstract void display();
//     void show(){
//         System.out.println("inside sample class");
//     }
// }

// class mapple extends sample{
//     void display(){
//         System.out.println("inside mapple");
//     }
// }

// public class abs {
//     public static void main(String[] args) {
//         mapple obj=new mapple();
//         obj.display();
//         obj.show();
//     }
// }


// interface

interface int1 {
    final  int a=100;
    void display();
    void show();
    
}
interface int2 {
    final  int b=200;
    void display1();
    void show1();
    
}
class mapple implements int1,int2{
    public void display(){
        System.out.println("inside mapple display");
    }
    public void show(){
        System.out.println("inside show");
    }
    public void display1(){
        System.out.println("inside mapple display1");
    }
    public void show1(){
        System.out.println("inside show1 ");
    }
    void printing(){
        System.out.println(a+" "+b);
    }
}
public class abs{
    public static void main(String[] args) {
        mapple obj=new mapple();
        obj.display();
        obj.show();
        obj.display1();
        obj.show1();
        obj.printing();
    }
}