package Test4;

/**
 * Created by 16679 on 2020/4/15.
 */
public abstract class Door {
    public void open() {
        System.out.println("开门");
    }
    public void close() {
        System.out.println("关门");
    }
    public abstract void fireProof();
}
