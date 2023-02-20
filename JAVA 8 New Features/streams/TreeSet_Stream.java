package streams;

import java.util.*;

public class TreeSet_Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set=new TreeSet<>();
        //supports unique values and output is in sorted(ascending order)order
        for(Integer i:list)
            set.add(i);
        for(int i:set)
            System.out.println(i);



    }
}
