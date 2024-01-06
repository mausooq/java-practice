public class test {
    public static void main(String[] args) {
        
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i);
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 6; i <= 10; i++) {
                    System.out.print(i);
                }
            }
        };
        t1.start();
        t2.start();
    }
    }