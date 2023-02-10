//Userdefined Functional Interface
import java.lang.*;
@FunctionalInterface
public interface FunctionalInterfaceDemo{
    void singleAbstractMethod();
    default void printName()
    {
        System.out.println("Hello");
    }
    default void printName2()
    {
        System.out.println("Hi");
    }
}
