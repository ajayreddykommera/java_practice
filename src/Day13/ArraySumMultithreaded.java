package Day13;

import java.util.concurrent.*;

public class ArraySumMultithreaded {
    private static final int ARRAY_SIZE = 100;
    private static final int THREAD_COUNT = 5;
    private static final int PARTIAL_ARRAY_SIZE = ARRAY_SIZE / THREAD_COUNT;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        Future<Integer>[] partialSums = new Future[THREAD_COUNT];

        // Divide the array into partial arrays and assign each to a thread
        for (int i = 0; i < THREAD_COUNT; i++) {
            int startIndex = i * PARTIAL_ARRAY_SIZE;
            int endIndex = startIndex + PARTIAL_ARRAY_SIZE;

            Callable<Integer> sumTask = new SumTask(array, startIndex, endIndex);
            partialSums[i] = executor.submit(sumTask);
        }

        // Wait for all threads to finish and retrieve the partial sums
        int finalSum = 0;
        for (int i = 0; i < THREAD_COUNT; i++) {
            finalSum += partialSums[i].get();
        }

        executor.shutdown();

        System.out.println("Final sum: " + finalSum);
    }

    static class SumTask implements Callable<Integer> {
        private final int[] array;
        private final int startIndex;
        private final int endIndex;

        public SumTask(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public Integer call() {
            int sum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                sum += array[i];
            }
            return sum;
        }
    }
}
