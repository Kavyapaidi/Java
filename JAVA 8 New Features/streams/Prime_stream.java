import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.*;

public class Prime_stream {
    public static boolean isPrime(int x)
    {
        return x>1 && IntStream.range(2,x).noneMatch(i->x%i==0);
    }
    public static List<Integer> prime_nums(int n)
    {
        return IntStream.rangeClosed(2,n).filter(i->isPrime(i)).boxed().collect(Collectors.toList());
    }
    public static void main(String[] args) {
//        int n=20;
//        boolean b= IntStream.range(2,n).noneMatch(i->n%i==0);
//        if(b==true)
//            System.out.println("prime");
//        else {
//            System.out.println("not prime");
//        }
        System.out.println(prime_nums(40));


    }
}





