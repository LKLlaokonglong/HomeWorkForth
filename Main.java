package homeWorkForth;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("请输入两个数字");
        Scanner sca = new Scanner(System.in);
        double x = sca.nextDouble();
        double y =sca.nextDouble();
        System.out.println("------------");
        System.out.println("请选择计算方式 + - * /");
        String num =sca.next();
        Add add = new Add();
        Minus minus = new Minus();
        Multiply multiply =new Multiply();
        Divided divided =new Divided();
        if(num.equals("+") ){
            add.compute(x,y);
        }else if(num.equals("-")){
            minus.compute(x,y);
        }else if(num.equals("*")){
            multiply.compute(x,y);
        }else if(num.equals("/")){
            divided.compute(x,y);
        }else{
            System.out.println("您输入的有误");
        }
    }
}
