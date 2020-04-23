package Test6;


/**
 * Created by 16679 on 2020/4/15.
 */
import java.util.Scanner;
public class InterfaceExample {
    public static void main(String[] args) {
//输入圆的半径
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        double r;
        r = scan.nextInt();
//输入矩形的长
        Scanner x = new Scanner(System.in);
        System.out.print("请输入矩形长：");
        double a;
        a = x.nextInt();
//输入矩形的宽
        Scanner y = new Scanner(System.in);
        System.out.print("请输入矩形宽：");
        double b;
        b = y.nextInt();
//实体化Cricle类和Rectangle类
        Cricle cricle1 = new Cricle(r);
        Rectangle rectangle1 = new Rectangle(a, b);

        cricle1.grith();
        cricle1.area();
        rectangle1.grith();
        rectangle1.area();
    }
}
