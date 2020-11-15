package homeWorkForth;

public  class Minus implements Compute{
    @Override
    public void compute(double x, double y) {
        System.out.println("两数相减的结果为：" + (x - y));
    }
}
