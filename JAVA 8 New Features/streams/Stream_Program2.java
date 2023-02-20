package streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
// find the first non-repeated character
public class Stream_Program2 {
    public static void main(String[] args) {
        String str="Kavya loves java and badminton";
//        str.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
//                .forEach(s-> System.out.print(s+","));

        /*Character ch=str.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))//It returns stream of characters
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()==1)//int(1) to long(1L)
                .map(x->x.getKey())
                .findFirst()
                .get();
        System.out.println(ch);*/

        //find the first repeated character
        //Stream of String
        /*Character ch=str.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))//It returns stream of characters
                .entrySet()
                .stream()
                .filter(x->x.getValue()>1L)//int(1) to long(1L)
                .map(x->x.getKey())
                .findFirst()
                .get();
        System.out.println(ch);*/

//        java 7
//        for(int i=0;i<str.length();i++)
//        {
//            System.out.println(str.charAt(i));
//        }

//        java8
        str.chars()//returns stream of ints(IntStream) character codes,so we are converting it to char  [Stream<Integer>]
                .mapToObj(i ->(char)i)//int to char (mapToObj) is used  [Stream<Character>]
                .forEach(System.out::println);
    }
}
