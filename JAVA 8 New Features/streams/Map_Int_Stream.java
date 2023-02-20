// IntStream which contains length of each element in given Stream

package streams;

import java.util.Arrays;
import java.util.List;

public class Map_Int_Stream {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Kavya","Lavanya","Naveen","Lakshmi");
        names.stream()
                .mapToInt(name->name.length())
                .forEach(n-> System.out.println(n+" "));
//
//        int result=names.stream().mapToInt(name->name.length())
//                .filter(x->x>5)
//                .map(x->x*2)
//                .sum();
////              .reduce(0,(c,e)->c+e);
//        System.out.println(result);
//        we can use either sum() or reduce()
    }
}
