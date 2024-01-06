import java.util.Scanner;
import project.package3;
import project.package2;

public class package1 {
     public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        package2 obj =new package2();
        obj.m=10;
        obj.n=10;
        obj.addition();
        package3 obj1 =new package3();
        obj1.a=10;
        obj1.b=10;
        obj1.sub();
        in.close();
    }
}
