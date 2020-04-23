package Test4;

/**
 * Created by 16679 on 2020/4/15.
 */
public class BulletProofDoor extends Door implements BulletSafe {
    @Override
    public void bulletProof() {
        System.out.println("防弹");
    }
    @Override
    public void fireProof() {
        System.out.println("防弹门的防火属性");
    }
}
