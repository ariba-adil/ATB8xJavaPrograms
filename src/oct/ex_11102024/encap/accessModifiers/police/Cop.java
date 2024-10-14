package oct.ex_11102024.encap.accessModifiers.police;

public class Cop {
    private int gun;
    private String idCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot() {
        System.out.println("Yes you can!!");
    }
}
