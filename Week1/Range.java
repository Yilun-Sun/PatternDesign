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

    public Range(String name) {
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name);
    }

    public void start(int start) {
        this.start = start;
    }

    public void end(int end) {
        this.end = end;
    }

    public int[] value() {
        // TODO:
        int[] arr = new int[end - start];
        for (int i = start; i < end; i++) {
            arr[i] = i;
        }
        return arr;
    }
}