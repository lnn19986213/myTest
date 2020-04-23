package Test6;

/**
 * Created by 16679 on 2020/4/15.
 */
public class Cricle implements Shape2D {
    //圆的半径（成员变量，构造方法）
    double redius;
    public Cricle(double r){
        redius = r;
    }
    //计算圆的周长
    public void grith(){
        double l1 = 2*PI*redius;
        System.out.println("圆的周长为：" + l1);
    }
    //计算圆的面积
    public void area(){
        double s1 = redius*redius*PI;
        System.out.println("圆的面积为：" + s1);
    }
}
