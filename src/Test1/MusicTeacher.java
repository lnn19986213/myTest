package Test1;

/**
 * Created by 16679 on 2020/4/15.
 */
public class MusicTeacher extends Teacher {
    public MusicTeacher(int id, String name, String sex, int age,
                        String education, String teacherTitile) {
        super(id, name, sex, age, education, teacherTitile);
    }
    @Override
    public void teachProcedure() {
        System.out.println("先唱歌，后弹琴");
    }
}
