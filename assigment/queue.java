import java.util.PriorityQueue;

public class queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        pq.add(200);
        pq.add(100);
        pq.add(2);
        pq.add(10044);
        pq.add(1000);
        pq.add(10);
        pq.add(1);
        pq.add(222);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.clear();
        System.out.println(pq);
    }
}
