import java.util.Scanner;
class operation{
    Scanner k= new Scanner(System.in);
    void display(){
        int balance=100000;
        System.out.println("1.money withdrawal\n2.money deposit\n3.change pin\n4.Check balance\n");
        int ch=k.nextInt();
        switch (ch) {
            case 1: int amount;
            System.out.println("enter the amount to withdraw");
            amount = k.nextInt();
            balance=balance-amount;
            System.out.println(amount+"amount have been withrawed");
            System.out.println("remaining balance"+balance);
            break;
            
            case 2: int am;
            System.out.println("enter the amount to be deposited");
            am=k.nextInt();

            balance=balance+am;
            System.out.println(am+"amount have been depsoited");
            System.out.println("remaining balance"+balance);
            break;
            case 3: System.out.println("enter new pin");
            int pin = k.nextInt();
            System.out.println(pin+"new pin have been updated ");
            break;
            case 4: System.out.println(balance+"balance");
            break;

            }
        }
        
    }

class SBI extends operation{
    void show(){
        super.display();
    }

    }


class Union extends operation{
    void show1(){
        super.display();;

    }

}

class Axis extends operation{
    void show2(){
        super.display();
    }
 
}

class Kotak extends operation{
    void show3(){
        super.display();
    }

}
public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("1.SBI\n2.Union\n3.Axis\n4.kotak\n");
        System.out.println("enter your Choice:");
        int choice=sc.nextInt();
        switch (choice){
            case 1 : SBI obj = new SBI();
            obj.show();
            break;
            case 2: Union obj1 = new Union();
            obj1.show1();
            break;
            case 3: Axis obj2 = new Axis();
            obj2.show2();
            break;
            case 4: Kotak obj3 = new Kotak();
            obj3.show3();
            break;
            default: System.out.println("invalid input");
        
    }
    
    }
}
