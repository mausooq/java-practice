import java.util.Scanner;
interface sample{
            void withdraw();
            void deposit();
            void pin();
            void status();
}
class SBI implements sample{
    public void withdraw(int balance,int amount){
                balance=balance-amount;
                System.out.println(amount+"  amount have been withrawed");
                System.out.println("remaining balance  "+balance);
    }
    public void deposit(int balance,int am){

                balance=balance+am;
                System.out.println(am+" amount have been depsoited");
                System.out.println("remaining balance "+balance);
    }
    public void pin(){
                    Scanner k= new Scanner(System.in);
                System.out.println("enter new pin");
                int pin = k.nextInt();
                System.out.println(pin+" new pin have been updated ");
    }
    public void status(){

    }
    void display(){
            Scanner k= new Scanner(System.in);
            int balance=100000;
            System.out.println("1.money withdrawal\n2.money deposit\n3.change pin\n4.Check balance\n");
            int ch=k.nextInt();
            switch (ch) {
                case 1: int amount;
                System.out.println("enter the amount to withdraw");
                amount = k.nextInt();
                withdraw(balance,amount);
                break;
                case 2: int am;
                System.out.println("enter the amount to be deposited");
                am=k.nextInt();
                deposit(balance,am);
                break;
                case 3:pin();
                break;
                case 4: System.out.println(balance+" balance");
                break;

                }
            }
    @Override
    public void withdraw() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }
    @Override
    public void deposit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }
            
    }

public class bank2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("1.SBI\n2.Union\n3.Axis\n4.kotak\n");
        System.out.println("enter your Choice:");
        int choice=sc.nextInt();
        switch (choice){
            case 1 : SBI obj = new SBI();
            obj.display();
            break;
            // case 2: Union obj1 = new Union();
            // obj1.display();
            // break;
            // case 3: Axis obj2 = new Axis();
            // obj2.display();
            // break;
            // case 4: Kotak obj3 = new Kotak();
            // obj3.display();
            // break;
            default: System.out.println("invalid input");
        
    }
    
    }
}

