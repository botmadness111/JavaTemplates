package Third;

import com.sun.tools.javac.Main;

public class Third {
    private static final MySyncMap<Integer, Integer> map = new MySyncMap<Integer, Integer>();
    private static final MySyncSet<Integer> set = new MySyncSet<Integer>();

    public static void main(String[] args) throws InterruptedException {
        Third main = new Third();
//        main.testMap();
//        System.out.println(map.size());

        main.testSet();
        System.out.println(set.size());
    }

    public void testMap() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    map.put(i, i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10000; i < 20000; i++) {
                    map.put(i, i);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    public void testSet() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    set.add(i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10000; i < 20000; i++) {
                    set.add(i);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
