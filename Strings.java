import java.sql.SQLOutput;

public class Strings {
    public static void main(String[] args) {
        String name="Kavya";
        String name1="Kavs";
        System.out.println(name);
        System.out.println("Hello "+name);
        System.out.println(name.concat("sri"));
        System.out.println(name.charAt(2));
        System.out.println(name.toUpperCase());
        System.out.println(name.equals(name1));
        System.out.println(name.indexOf('v'));
    }
}
