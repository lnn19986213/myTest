package Test3;

/**
 * Created by 16679 on 2020/4/15.
 */
public class Bus implements Vehicle {
    public void start(int a){
        System.out.println("公交车发动，速度:"+a);
    }
    public void stop(int b){
        System.out.println("公交车停止");
    }
}
