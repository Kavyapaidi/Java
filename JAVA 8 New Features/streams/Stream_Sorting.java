package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Sorting {
    public static void main(String[] args) {
        //sort in ascending order
        List<Integer> list1= Arrays.asList(10,15,8,49,25,98,98,32,15);
//      list1.stream().sorted().forEach(System.out::println);

        //sort in descending order
        list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
