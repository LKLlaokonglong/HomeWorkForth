package homeWorkForth;

public class Multiply implements Compute{
    @Override
    public void compute(double x, double y) {
        System.out.println("两数相乘的结果为：" + (x * y));
    }
}
