import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {
        Collection<Integer> nums=new TreeSet<>();
        nums.add(10);
        nums.add(9);
        nums.add(8);
        nums.add(7);
        System.out.println(nums);
        //sorted order
        Iterator<Integer> it=nums.iterator();
        while(it.hasNext()){
        System.out.println(it.next());}

    }
}
