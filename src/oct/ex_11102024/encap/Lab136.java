package oct.ex_11102024.encap;

public class Lab136 {
    public static void main (String [] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "Hacker";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("goodadmin", "admin123");
        //we cannot use them now because now they are encapsulated in their vicinity
        //System.out.println(vwoLogin1.password);

        //vwoLogin1.password = "password123";
        //in order to change their values use getter setter in their vicinity - in the class they are defined

        System.out.println(vwoLogin1.getPassword());

        boolean isAdmin = true;
        vwoLogin1.setPassword("newpassword", isAdmin );
        System.out.println(vwoLogin1.getPassword());
    }
}
