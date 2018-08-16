package concurrency;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.*;
import java.util.stream.LongStream;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

//        long limit = 100_000;
//        Instant start = Instant.now();
//        Runnable runnable = () -> {
//            long primes = LongStream.range(2, limit)
//                    .filter(p -> LongStream.range(2, p).noneMatch(n -> p % n == 0)).count();
//            System.out.printf("%d primes below %d completed in %d milliseconds%n",
//                    primes, limit, Duration.between(start, Instant.now()).toMillis());
//        };
//        executorService.submit(runnable);
//        executorService.submit(runnable);



        long limit = 100_000;
        Instant start = Instant.now();
        Callable<Long> callable = () -> {
            long primes = LongStream.range(2, limit)
                    .filter(p -> LongStream.range(2, p).noneMatch(n -> p % n == 0)).count();
            return primes;
        };

        Future<Long> future = executorService.submit(callable);

        long primes = 0;
        try {
            primes = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.printf("%d primes below %d completed in %d milliseconds%n",
                primes, limit, Duration.between(start, Instant.now()).toMillis());


        executorService.shutdown();
    }
}
