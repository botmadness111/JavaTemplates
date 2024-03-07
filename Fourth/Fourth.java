package Fourth;

import java.util.concurrent.*;

public class Fourth {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        MyExecutoreService myExecutoreService = new MyExecutoreService(5);

        for (int i = 0; i < 5; i++) {
            myExecutoreService.execute(() -> {
                System.out.println("Hello ");
            });
        }

        myExecutoreService.shutdown();
    }
}

