import java.util.ArrayList;
import java.util.Arrays;

public class Range2 {
    // private int start;
    // private int end;
    // private boolean leftIsInclusive;
    // private boolean rightIsInclusive;
    public int[] range;

    public Range2(int[] range) {
        this.range = range;
    }

    public Range2() {
    }

    // public static Builder builder() {
    //     return new Builder();
    // }
    public Range2 of(int endNum) {
        Range2 range = new Range2.Builder().includeStart(0).excludeEnd(endNum).build();
        return range;
    }

    public Range2 slice(int startIndex) {
        int[] temp_range = this.range;
        // System.out.println(Arrays.toString(temp_range));
        // Range2 range = new Range2.Builder().start(temp_start + startIndex).end(temp_end).build();
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = startIndex; i < temp_range.length; i++) {
            list.add(temp_range[i]);
        } 
        int[] new_range = new int[list.size()];
        // ArrayList to Array Conversion 
        for (int i = 0; i < list.size(); i++) 
            new_range[i] = list.get(i); 

        this.range = new_range;
        return this;
    }

    // left-inclusive, right-exclusive
    public Range2 slice(int startIndex, int endIndex) {
        int[] temp_range = this.range;
        // System.out.println(Arrays.toString(temp_range));
        // Range2 range = new Range2.Builder().start(temp_start + startIndex).end(temp_end).build();
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = startIndex; i < endIndex; i++) {
            list.add(temp_range[i]);
        } 
        int[] new_range = new int[list.size()];
        // ArrayList to Array Conversion 
        for (int i = 0; i < list.size(); i++) 
            new_range[i] = list.get(i); 

        this.range = new_range;
        return this;
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

        public Range2 build() {
            return new Range2(value());
        }
    }

}