package streams;

import java.util.stream.IntStream;

public class Stream_1 {
    public static void main(String[] args)
    {
        IntStream stream = IntStream.range(3,8);
        stream.forEach(x-> System.out.print(x+" "));
    }
}
