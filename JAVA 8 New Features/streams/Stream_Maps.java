//Map Examples
package streams;
import java.util.*;
import java.util.stream.Collectors;
public class Stream_Maps {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("Kavya","","Lavanya","Naveen","Lakshmi");
//        1. Convert String to uppercase and Join them with coma
//        return type string for Collectors.joining()
        String str1=strings.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(str1);

//        2. Create a List of the squares of all distinct numbers in descending order
        List<Integer> nums=Arrays.asList(2,5,1,7,2,4,9,7);
        List<Integer> distinct_squares=nums.stream().map(x->x*x).distinct()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(distinct_squares);

//        3.Statistics Example: Get min, max, sum, and the average for numbers

//        OptionalDouble avg=nums.stream().mapToInt(x->x).average();
//        System.out.println(avg);

//        Since these statistics operations are numeric in nature, it's essential to call the mapToInt() method.
//        After this, we call the summaryStatistics(),which returns an instance of an IntSummaryStatistics.
//        It is this object which provides us utility method like getMin(), getMax(), getSum() or getAverage().
        IntSummaryStatistics stats=nums.stream().mapToInt(x->x).summaryStatistics();
        // average
        double avg=stats.getAverage();
        System.out.println(avg);
        // sum
        long sum=stats.getSum();
        System.out.println(sum);
        // min
        int min=stats.getMin();
        System.out.println(min);
        // max
        int max=stats.getMax();
        System.out.println(max);
        // count
        long count=stats.getCount();
        System.out.println(count);

        // numbers starts with 1
        List<Integer> list=Arrays.asList(1,22,56,16,45,100,191,88);
        //converting every number to string
        //number+string=string
        list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(s-> System.out.print(s+" "));








    }
}
