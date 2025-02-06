import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Random;

class SlidingWindowMedianTest {
    private static Random random = new Random();

    private static int[] generateRandomArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    @Test
    public void testOptimizedMedian_100000_51() {
        int n = 100_000;
        int k = 51;
        int[] nums = generateRandomArray(n);

        int[] resultNaive = SlidingWindowMedianNaive.naiveMedian(nums, k);
        int[] result = SlidingWindowMedian.optimizedMedian(nums, k);
        assertNotNull(result);
        assertArrayEquals(resultNaive, result, "Arrays are not equal!");
    }

    @Test
    public void testOptimizedMedian_100000_501() {
        int n = 100_000;
        int k = 501;
        int[] nums = generateRandomArray(n);

        int[] resultNaive = SlidingWindowMedianNaive.naiveMedian(nums, k);
        int[] result = SlidingWindowMedian.optimizedMedian(nums, k);
        assertNotNull(result);
        assertArrayEquals(resultNaive, result, "Arrays are not equal!");
    }

    @Test
    public void testOptimizedMedian_100000_5001() {
        int n = 100_000;
        int k = 5001;
        int[] nums = generateRandomArray(n);

        int[] resultNaive = SlidingWindowMedianNaive.naiveMedian(nums, k);
        int[] result = SlidingWindowMedian.optimizedMedian(nums, k);
        assertNotNull(result);
        assertArrayEquals(resultNaive, result, "Arrays are not equal!");
    }

    @Test
    public void testOptimizedMedian_1000000_51() {
        int n = 1_000_000;
        int k = 51;
        int[] nums = generateRandomArray(n);

        int[] resultNaive = SlidingWindowMedianNaive.naiveMedian(nums, k);
        int[] result = SlidingWindowMedian.optimizedMedian(nums, k);
        assertNotNull(result);
        assertArrayEquals(resultNaive, result, "Arrays are not equal!");
    }

    @Test
    public void testOptimizedMedian_1000000_501() {
        int n = 1_000_000;
        int k = 501;
        int[] nums = generateRandomArray(n);

        int[] resultNaive = SlidingWindowMedianNaive.naiveMedian(nums, k);
        int[] result = SlidingWindowMedian.optimizedMedian(nums, k);
        assertNotNull(result);
        assertArrayEquals(resultNaive, result, "Arrays are not equal!");
    }
}