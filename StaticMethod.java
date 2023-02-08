class Mobiless{
    String brand;
    int price;
    static String name;
    public void show()
    {
        System.out.println(brand+","+price+","+name);
    }
    public static void show1(Mobiless obj)//static method with object reference
    {
        System.out.println(obj.brand+","+obj.price+","+name);
    }
    public static void show2()//static method without object reference
    {
        System.out.println(name);
    }


}
public class StaticMethod
{
    public static void main(String[] args) {
        Mobiless obj1=new Mobiless();
        obj1.brand="Apple";
        obj1.price=1500;

        Mobiless obj2=new Mobiless();
        obj2.brand="Samsung";
        obj2.price=1700;

        Mobiless.name="Smart Phone";//Initializing the static variable

        obj1.show();
        Mobiless.show1(obj1);
        obj2.show();
        Mobiless.show1(obj2);

        Mobiless.show2();
    }
}

