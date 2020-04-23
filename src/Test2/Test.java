package Test2;

/**
 * Created by 16679 on 2020/4/15.
 */
public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car("奔驰",4);
        Vehicle motorbike = new Motorbike("艾玛",2);
        System.out.println(car);
        car.run();
        car.wheelsNum();
        System.out.println(motorbike);
        motorbike.run();
        motorbike.wheelsNum();
    }
}
