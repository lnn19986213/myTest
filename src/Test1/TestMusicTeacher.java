package Test1;

/**
 * Created by 16679 on 2020/4/15.
 */
public class TestMusicTeacher {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Teacher musicTeacher = new MusicTeacher(1, "张三", "男", 0, "音乐", "教授");
        musicTeacher.startWork(9);
        musicTeacher.offWork(17);
        System.out.println(musicTeacher);
        musicTeacher.teachProcedure();
    }
}
