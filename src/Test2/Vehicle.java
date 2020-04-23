package Test2;

/**
 * Created by 16679 on 2020/4/15.
 */
public abstract class Vehicle {
    private String name;
    private int number;
    public Vehicle(String name,int number) {
        super();
        this.name = name;
        this.number = number;
    }
    //get，set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    abstract void wheelsNum();
    public void run(){
        System.out.println("Running");
    }
    //run方法
    public String toString() {
        return "车种：" + name + "，车轮数:" + number;
    }
}
