import java.lang.ClassNotFoundException;
class Mobiles{
    String brand;
    int price;
    static String name;
    static
    {
        name="Phone";
        System.out.println("in static block");
    }
    public Mobiles(){
         brand="";
         price=200;
        System.out.println("in constructor block");
    }
    public void show()
    {
        System.out.println(brand+","+price+","+name);
    }
}
public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobiles");

    }
}
