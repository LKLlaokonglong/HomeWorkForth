package homeWorkForth;

public class Divided implements Compute{
    @Override
    public void compute(double x, double y) {
        System.out.println("两数相除的结果为："+ (x / y));
    }
}
