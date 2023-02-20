// Collectors Examples
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Collectors {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("Kavya","","Lavanya","Naveen","Lakshmi","");
//        1.Remove all empty Strings from List
        List<String> list1=str.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
        System.out.println(list1);

//        2.Create a List with String more than 6 characters
        List<String> list2=str.stream().filter(x->x.length()>6).collect(Collectors.toList());
        System.out.println(list2);



    }
}
