import java.util.Arrays;

public class SlidingWindowMedianNaive {
    /**
     * Algorytm naiwny: dla każdego okna kopiuje elementy, sortuje je
     * i wybiera element środkowy jako medianę.
     *
     * @param nums Tablica wejściowa
     * @param k    Rozmiar okna
     * @return Tablica median dla przesuwających się okien
     */
    public static int[] naiveMedian(int[] nums, int k) {
        int n = nums.length;
        int[] medians = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int[] window = Arrays.copyOfRange(nums, i, i + k);
            Arrays.sort(window);
            medians[i] = window[k / 2];
        }

        return medians;
    }
}
