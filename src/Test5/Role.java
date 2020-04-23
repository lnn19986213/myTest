package Test5;

/**
 * Created by 16679 on 2020/4/15.
 */
public abstract class Role {
    private String name;
    private int age;
    private String sex;

    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    abstract void play();

    public Role() {
        System.out.println("无参构造！");
    }
    public Role(String name, int age, String sex) {
        super();
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String toString() {
        return  "name=" + name + ", sex=" + sex
                + ", age=" + age;
    }
}
