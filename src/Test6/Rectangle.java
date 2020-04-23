package Test6;

/**
 * Created by 16679 on 2020/4/15.
 */
public class Rectangle implements Shape2D {
    double height;
    double weight;
    public Rectangle(double a,double b){
        height = a;
        weight = b;
    }
    //计算矩形周长
    public void grith(){
        double l2 = (weight+height)*2;
        System.out.println("矩形的周长为：" + l2);
    }
    //计算矩形面积
    public void area(){
        double s2 = weight*height;
        System.out.println("矩形的面积为：" + s2);
    }
}
