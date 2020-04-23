package Test5;

/**
 * Created by 16679 on 2020/4/15.
 */
public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1);
        e1.play();
        Employee e2 = new Employee("张三",25,"男");
        System.out.println(e2);
        e2.sing();
    }

}
