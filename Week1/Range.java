public class Range {
    private int start;
    private int end;
    private boolean leftIsInclusive;
    private boolean rightIsInclusive;


    public Range(int start, int end) {
        // default is left-inclusive & right-exclusive
        this.start = start;
        this.end = end;
    }

    // public Range() {

    // }

    public Range start(int start) {
        this.start = start;
        return this;
    }

    public Range end(int end) {
        this.end = end;
        return this;
    }

    public int[] value() {
        // TODO:
        int[] arr = new int[end - start];
        for (int i = 0; i < end - start; i++) {
            arr[i] = i + start;
        }
        return arr;
    }
}