import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> nums=new HashSet<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(2);//repeated value
        System.out.println(nums);
        //when u print nums,it is not printing the repeated value which is 2 here
        //set supports unique values
        Set<Integer> nums1=new HashSet<>();
        nums1.add(22);
        nums1.add(11);
        nums1.add(5);
        nums1.add(9);
        nums1.add(14);
        System.out.println(nums1);
        //when you print nums1,the order of output is random
        //it doesn't have get(),means list doesn't support index value

    }
}
