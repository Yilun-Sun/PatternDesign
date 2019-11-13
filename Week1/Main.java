import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Range range = new Range()._start(1)._end(11);
        // Range range = new Range().construct._start(1)._end(11);

        Range range_01 = new Range.Builder().start(1).end(11).build();
        Range range_02 = new Range().of(11);

        System.out.println(Arrays.toString(range_01.range));
        System.out.println(Arrays.toString(range_02.range));
    }
}