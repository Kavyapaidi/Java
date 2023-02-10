public class MethodReferenceDemo {
    public static void main(String[] args)
    {
        FunctionalInterfaceDemo fd=Test::testImplementation;
        fd.singleAbstractMethod();
        /*FunctionalInterfaceDemo fd=()-> System.out.println("IMPLEMENTATION of SAM");
        fd.singleAbstractMethod();
        */
    }
}
class Test
{
    public static void testImplementation()
    {
        System.out.println("This is test implementation of your abstract method");
    }
}
