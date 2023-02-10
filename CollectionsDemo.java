import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
//Collections is  a class
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        //Collections.sort(nums);
        //we can sort the elements using sort() in Collections class
        //System.out.println(nums);
        Comparator<Integer> com=new Comparator<>() {
            @Override
            public int compare(Integer i,Integer j) {
                if(i%10>j%10)//swapping based on the last digit of a number
                    return 1;//swap
                return -1;//no swap
            }
        };
    Collections.sort(nums,com);
    //you can write your own logic for this sort method using comparator Interface
        System.out.println(nums);
    }
}
