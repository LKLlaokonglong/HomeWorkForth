package homeWorkForth;

public class Add implements Compute {
    @Override
    public void compute(double x, double y) {
        System.out.println(" 两数相加的结果为：" + (x + y));
    }
}
