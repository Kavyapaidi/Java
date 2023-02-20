package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_2 {
    public static void main(String[] args) {
//        String[] arr={"Kavya","Lavanya","Gopini","kusuma"};
//        Stream s1= Arrays.stream(arr,1,3);
//        s1.forEach(str->System.out.print(str+" "));
//        int[] arr1={1,2,3,4,5};
//        IntStream s2= Arrays.stream(arr1);
//        s2.forEach(i->System.out.print(i+" "));
//        OptionalDouble obj=s2.average();
//        if(obj.isPresent())
//            System.out.println(obj.getAsDouble());
//        else
//        {
//            System.out.println("-1");
//        }

//        List<Integer> square=numbers.stream().map(x->x*x).collect(Collectors.toList());
//        System.out.println(square);
//        Stream<Object> s1=numbers.stream().map(x->x*x);
//        s1.forEach(x-> System.out.println(x));

//        IntStream s2= (IntStream) numbers.stream().filter(x->x%2==0);
//        s2.forEach(x-> System.out.println(x));





//        List<Integer> numbers=Arrays.asList(2,3,4,5,6);
//        Stream<Integer> s1=numbers.stream();
//        Stream<Integer> sorted_data=s1.sorted();
//        Stream<Integer> mapped_data=sorted_data.map(n->n*2);
//        mapped_data.forEach(x-> System.out.print(x+" "));

                List<Integer> numbers=Arrays.asList(2,3,4,5,6);
                //odd numbers
                  Stream<Integer> s1=numbers.stream().filter(n->n%2==1).sorted().map(n->n*2);
                s1.forEach(x-> System.out.println(x));

        int result=numbers.stream().filter(n->n%2==1).sorted().map(n->n*2).reduce(0,(c,e)->c+e);
        System.out.println(result);



    }
}
