package oct.ex_11102024.encap.accessModifiers.police;

public class JrCop {
    public static void main(String [] args) {
        Cop jrCop = new Cop(20);
        //System.out.println(jrCop.gun);
        jrCop.canIShoot();
    }
}
