//Print ten random numbers using forEach
package streams;

import java.util.Random;

public class Stream_Random {
    public static void main(String[] args) {
        Random random=new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
