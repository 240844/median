import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SlidingWindowMedian {
    /**
     * Algorytm z użyciem dwóch TreeSet do znajdowania mediany w oknach.
     *
     * @param nums Tablica wejściowa
     * @param k    Rozmiar okna
     * @return Tablica median dla przesuwających się okien
     */
    public static int[] optimizedMedian(int[] nums, int k) {
        int n = nums.length;
        int[] medians = new int[n - k + 1];

        TreeSet<MedianPair> leftTree = new TreeSet<>();
        TreeSet<MedianPair> rightTree = new TreeSet<>();

        Runnable balanceTrees = () -> {
            while (leftTree.size() > rightTree.size() + 1) {
                rightTree.add(leftTree.pollLast());
            }
            while (leftTree.size() < rightTree.size()) {
                leftTree.add(rightTree.pollFirst());
            }
        };

        MedianPair[] window = new MedianPair[k];
        for(int i = 0; i < k; i++) {
            window[i] = new MedianPair(nums[i], i);
        }
        Arrays.sort(window);
        leftTree.addAll(Arrays.asList(window));
        balanceTrees.run();

        medians[0] = leftTree.last().getValue();
        for (int i = k-1, z = 1; z < n - k + 1; i++) {
            MedianPair toRemove = new MedianPair(nums[z-1], z-1);

            if (leftTree.contains(toRemove)) {
                leftTree.remove(toRemove);
            } else {
                rightTree.remove(toRemove);
            }
            MedianPair newElement = new MedianPair(nums[i+1], i+1);
            if (leftTree.isEmpty() || newElement.getValue() <= medians[z-1]) {
                leftTree.add(newElement);
            } else {
                rightTree.add(newElement);
            }

            balanceTrees.run();

            medians[z] = leftTree.last().getValue();
            z++;

        }
        return medians;
    }

}
