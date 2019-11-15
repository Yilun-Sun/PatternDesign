public class Range {
    private int start;
    private int end;
    private boolean leftIsInclusive;
    private boolean rightIsInclusive;
    public int[] range;

    public Range(int[] range) {
        this.range = range;
    }

    public Range() {
    }

    // public static Builder builder() {
    //     return new Builder();
    // }
    public Range of(int endNum) {
        Range range = new Range.Builder().includeStart(0).excludeEnd(endNum).build();
        return range;
    }

    public static class Builder {
        private int start;
        private int end;
        private boolean includeStart;
        private boolean includeEnd;

        public Builder(){}

        public Builder includeStart(int start) {
            this.start = start;
            return this;
        }

        public Builder excludeStart(int start) {
            this.start = start + 1;
            return this;
        }
    
        public Builder includeEnd(int end) {
            this.end = end + 1;
            return this;
        }

        public Builder excludeEnd(int end) {
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

        public Range build() {
            return new Range(value());
        }
    }

}