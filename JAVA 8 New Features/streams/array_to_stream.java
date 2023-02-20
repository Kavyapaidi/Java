package streams;

import java.util.stream.Stream;

public class array_to_stream {
    public static void main(String[] args) {
        String[] names={"Java", "Python", "JavaScript"};
//        Stream stream1=Stream.of("Java", "Python", "JavaScript");
        Stream stream1=Stream.of(names);
        stream1.forEach(System.out::println);
    }
}
