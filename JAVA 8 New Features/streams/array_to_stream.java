//Difference between Stream.of() and Arrays.stream() method in Java
package streams;

import java.util.Arrays;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
import java.util.stream.*;


public class array_to_stream {
    public static void main(String[] args) {
//        string array to stream
        String[] names={"Java", "Python", "JavaScript"};
//        Stream stream1=Stream.of("Java", "Python", "JavaScript");
        Stream stream1=Stream.of(names);
        stream1.forEach(System.out::println);


//        Passing an integer array, the Stream.of() method returns Stream
//        whereas Arrays.stream() returns an IntStream.

//        Stream.of() returns Stream
        int[] arr={1,2,3,4,5};
        Stream s1=Stream.of(arr);
        s1.forEach(x-> System.out.println(x));
        //Basically we use above one for string array


//        Arrays.stream() returns IntStream
        int[] arr1={1,2,3,4,5};
        IntStream s2= Arrays.stream(arr1);
        s2.forEach(x-> System.out.println(x));
        //Basically we use above one for int array

    }
}
