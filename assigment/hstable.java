import java.util.HashSet;
import java.util.Iterator;
public class hstable {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(200);
        hs.add(2);
        hs.add(20);
        hs.add(100);
        hs.add(0);
        hs.add(50);
        hs.add(280);
        hs.add(80);
        hs.add(50);
        hs.add(1000);
        System.out.println(hs);
        Iterator<Integer> it =hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // hs.clear();
        // System.out.println(hs);
        hs.remove(500);
        System.out.println(hs);
        
    }
}
