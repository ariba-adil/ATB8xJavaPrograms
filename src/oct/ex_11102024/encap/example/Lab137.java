package oct.ex_11102024.encap.example;

public class Lab137 {
    public static void main (String [] args) {
        ICICIBank amit = new ICICIBank("amit", 100);
        //amit.bal = 1000; // private name
        //amit.setBal(1000000);

        //write code to connect with mySQL
        //admin
        boolean are_you_admin = true;
        ICICIBank admin = new ICICIBank("admin", 1000);
        admin.setBal(5000, true);
        System.out.println(admin.getBal());
        System.out.println(admin.getName(are_you_admin));
    }
}
