import java.util.*;
import java.util.function.BiConsumer;

public class LambdaDemo {
    public static void main(String[] args)
    {
        //BiConsumer is the predefined functional interface
        //and it has only one method/function which is accept()
        //Functional interfaces references the lambda expression
        BiConsumer<Integer, Integer> biConsumer=(a,b)-> System.out.println(a+b);
        biConsumer.accept(10,5);
    }

}
