import java.sql.SQLOutput;

public interface InterfaceDemo{
    //void printNameABS();
    default void printName()
    {
        System.out.println("Welcome to Code Decode");
    }
}
