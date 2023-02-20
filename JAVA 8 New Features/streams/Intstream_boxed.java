//IntStream to stream of integers using IntStream-boxed()
package streams;

import java.util.Arrays;
import java.util.stream.*;

public class Intstream_boxed {
    public static void main(String[] args) {
        IntStream s1=IntStream.range(3,7);//3,4,5,6(
//        Stream si=s1.boxed();
        Stream<Integer> si=s1.boxed();
        si.forEach(x-> System.out.println(x));


//        Stream<String> ss=s1.boxed(); -->error
//        boxed() returns stream of integers,cannot returns stream of strings


    }
}
