package streams;
//In java to add prefix and suffix in a given
//String we will use StringJoiner class, a newly added in Java 8.
import java.util.StringJoiner;

public class String_Joiner_Class {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",","#","#");
        sj.add("Aeroplanes");
        sj.add("Trains");
        sj.add("Buses");
        System.out.println(sj);
    }
}
