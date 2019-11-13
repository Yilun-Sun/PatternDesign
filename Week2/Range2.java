public class Range2 {
    private int start;
    private int end;
    private boolean leftIsInclusive;
    private boolean rightIsInclusive;
    public int[] range;

    public Range2(int[] range) {
        this.range = range;
    }

    // public static Builder builder() {
    //     return new Builder();
    // }

    public static class Builder {
        private int start;
        private int end;

        public Builder(){}

        public Builder start(int start) {
            this.start = start;
            return this;
        }
    
        public Builder end(int end) {
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

        public Range2 build() {
            return new Range2(value());
        }
    }
}