//Filter Examples
package streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Filter {
    public static void main(String[] args) {
//        1. Counting Empty String
        List<String> str= Arrays.asList("Kavya","","Lavanya","Naveen","Lakshmi","");
//        int count= (int) str.stream().filter(x->x.isEmpty()).count();
//        long to int(explicit typecasting)
//        count() returns long value(public abstract long count())
//        filter() returns stream
//        public abstract Stream<T> filter(java.util.function.Predicate<? super T> predicate)
        long count= str.stream().filter(x->x.isEmpty()).count();
        System.out.println(count);


//        2. Count String whose length is more than three
        long count1=str.stream().filter(x->x.length()>3).count();
        System.out.println(count1);

//        3. Count number of String which starts with "L"
        long count2=str.stream().filter(x->x.startsWith("L")).count();
        System.out.println(count2);

//        4.Find the first number which is divisible by both 2 and 3
        List<Integer> nums=Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18);
        int n1=nums.stream().filter(x->x%2==0).filter(x->x%3==0)
                .findFirst().get();
        System.out.println(n1);

//        5.print odd numbers
        Stream.of(1,2,3,4,5).filter(x->x%2!=0).forEach(x-> System.out.print(x+" "));
        System.out.println();

        List<String> cars=new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Bugatti");
        cars.add("Ferrari");

        // Using multiple filter
        // length is > 5 and starts with M
        cars.stream().filter(x->x.length()>5).filter(x->x.startsWith("M"))
                .forEach(System.out::println);




    }
}
