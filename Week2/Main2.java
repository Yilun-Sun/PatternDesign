import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        // Range range = new Range()._start(1)._end(11);
        // Range range = new Range().construct._start(1)._end(11);
        Range2 range_01 = new Range2.Builder().includeStart(10).excludeEnd(20).build();
        Range2 range_02 = new Range2.Builder().includeStart(10).excludeEnd(20).build();

        range_01.slice(2);
        range_02.slice(2, 4);

        System.out.println(Arrays.toString(range_01.range));
        System.out.println(Arrays.toString(range_02.range));
    }
}