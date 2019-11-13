import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        /* 创建对象 */
//        Range range = new Range()._start(1)._end(11);
//        Range range = new Range().construct._start(1)._end(11);

        Range2 range = new Range2.Builder().start(1).end(11).build();

        System.out.println(Arrays.toString(range.range));
    }
}