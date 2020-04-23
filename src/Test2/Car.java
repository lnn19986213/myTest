package Test2;

/**
 * Created by 16679 on 2020/4/15.
 */
public class Car extends Vehicle {
    public Car( String name, int number){
        super(name, number);
    }
    @Override
    public void wheelsNum() {
        System.out.println("这是一辆四轮车");
    }
}
