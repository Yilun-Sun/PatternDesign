import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* 创建对象 */
//        Range range = new Range()._start(1)._end(11);
//        Range range = new Range().construct._start(1)._end(11);

        RangeBuilder bld = new RangeBuilder().start(1).end(11);
        Range range = bld.Done();

        System.out.println(Arrays.toString(range.value()));
    }
}