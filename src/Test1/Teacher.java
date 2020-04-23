package Test1;

/**
 * Created by 16679 on 2020/4/15.
 */
public abstract class Teacher {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String education;
    private String teacherTitile;
    //方法
    public void startWork(int time){
        System.out.println(this.name + time + "上班");
    }
    public void offWork(int time){
        System.out.println(this.name + time + "下班");
    }
    public void teach(String course){
        System.out.println(this.name  + "教" + course);
    }
    //构造方法
    public Teacher(int id, String name, String sex, int age, String education,
                   String teacherTitile) {
        super();
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.teacherTitile = teacherTitile;
    }
    //get，set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public String getTeacherTitile() {
        return teacherTitile;
    }
    public void setTeacherTitile(String teacherTitile) {
        this.teacherTitile = teacherTitile;
    }
    abstract public void teachProcedure();
    @Override
    //ToString方法
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", sex=" + sex
                + ", age=" + age + ", education=" + education
                + ", teacherTitile=" + teacherTitile + "]";
    }
}
