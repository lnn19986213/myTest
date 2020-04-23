package Test4;

/**
 * Created by 16679 on 2020/4/15.
 */
public class Test {
    public static void main(String[] args) {
        FireProofDoor fireProofDoor = new FireProofDoor();
        fireProofDoor.open();
        fireProofDoor.close();
        fireProofDoor.fireProof();
        System.out.println("----------------");
        BulletProofDoor bulletProofDoor = new BulletProofDoor();
        bulletProofDoor.open();
        bulletProofDoor.close();
        bulletProofDoor.bulletProof();
        bulletProofDoor.fireProof();
    }
}
