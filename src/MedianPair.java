public class MedianPair implements Comparable<MedianPair>{

    private int value;
    private int index;

    MedianPair(int value, int index) {
        this.value = value;
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public int compareTo(MedianPair o) {
        if (this.value != o.value) {
            return Integer.compare(this.value, o.value);
        }
        return Integer.compare(this.index, o.index);
    }

}
