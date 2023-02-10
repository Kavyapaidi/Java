
import java.util.*;

public class ArrayListDemo {

        public static void main(String[] args) {
            List<Integer> nums=new ArrayList<Integer>();
            nums.add(6);
            nums.add(5);
            nums.add(8);
            nums.add(2);
            System.out.println(nums.get(0));
            System.out.println(nums.indexOf(2));
            System.out.println(nums.size());
            System.out.println(nums.isEmpty());
            System.out.println(nums.contains(8));
            System.out.println(nums.remove(3));
            System.out.println(nums.size());
            nums.set(2,4);
            System.out.println(nums);
        }

    }

