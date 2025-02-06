import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] nums = {3, 1, 5, 7, 9, 2, 4, 6, 1};
        //int[] nums = {3, 1, 5, 7, 9, 2};
        //int[] nums = {10, 2, 5, 8, 7, 3, 6, 4, 9};
        //int[] nums = {12, 1, 15, 6, 9, 3, 7, 13, 10, 4, 8};
        //int[] nums = {8, 5, 1, 3, 12, 6, 9, 2, 7, 4};
        int[] nums = {3, 4, 1, 2, 8, 10, 7, 6, 5, 9};
        int k = 7;
        System.out.println(Arrays.toString(SlidingWindowMedianNaive.naiveMedian(nums, k)));
        System.out.println(Arrays.toString(SlidingWindowMedian.optimizedMedian(nums, k)));

    }
}