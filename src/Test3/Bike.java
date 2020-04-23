package Test3;

/**
 * Created by 16679 on 2020/4/15.
 */
public class Bike implements Vehicle {
    public void start(int a){
        System.out.println("自行车发动，速度:"+a);
    }
    public void stop(int b){
        System.out.println("自行车停止");
    }
}
