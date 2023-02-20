// find duplicate elements in list
//Implementing HashSet
package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates_Stream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set=new HashSet<>();
        //supports unique values and output is in random order

//        set.add(2);
//        set.add(2);
//        set.add(3);
//        for(int i:set)
//            System.out.println(i);
//        we cant add 98,15 into set becoz they are duplicates
//        so filter numbers which can't add into set and print it
        list.stream().filter(x->!set.add(x)).forEach(s-> System.out.println(s));

    }
}
