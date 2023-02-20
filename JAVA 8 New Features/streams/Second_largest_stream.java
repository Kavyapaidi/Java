package streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Second_largest_stream {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(5,3,8,11,2,25,34,81,56);
        int second_largest=nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(second_largest);
    }
}
