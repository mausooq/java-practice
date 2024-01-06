import java.util.Collections;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> arr=new LinkedList();
        System.out.println(arr);
        arr.add(5);
        arr.add(100);
        arr.add(150);
        arr.add(200);
        // arr.add("hello"); FOR STRING TYPE
        arr.add(0);
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.get(1));
        Collections.sort(arr);
        System.out.println(arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
        Collections.addAll(arr, 3,5,6);
        System.out.println(arr);
    }
}
