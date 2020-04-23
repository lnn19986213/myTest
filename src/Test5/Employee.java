package Test5;

/**
 * Created by 16679 on 2020/4/15.
 */
public class Employee extends Role {

    @Override
    public void play() {
        System.out.println("我在玩！！");
    }
    final public void sing() {
        System.out.println("我在唱歌！!");
    }

    public Employee() {
        System.out.println("Employee的无参构造器！");
    }
    public Employee(String name, int age, String sex) {
        super(name,age, sex);
        System.out.println("Emoployee的有参构造器！");
    }
}
