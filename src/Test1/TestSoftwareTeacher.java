package Test1;

/**
 * Created by 16679 on 2020/4/15.
 */
public class TestSoftwareTeacher {
    public static void main(String[] args) {
        Teacher softTeacher = new SoftwareTeacher(2, "李四", "女", 25, "软件老师", "教授");
        System.out.println(softTeacher);
        softTeacher.startWork(9);
        softTeacher.offWork(17);
        softTeacher.teachProcedure();
    }
}
