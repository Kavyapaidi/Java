import org.w3c.dom.ls.LSOutput;

import java.util.function.Predicate;

public class PredicateFunctionDemo {
    public static void main(String[] args) {
        //functional interface reference holds the lambda expression
        Predicate<String> checklength=s->s.length()>=5;
        System.out.println(checklength.test("code"));
    }
}
