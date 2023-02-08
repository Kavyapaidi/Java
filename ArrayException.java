public class ArrayException {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException
        int nums[]=new int[5];
        try {
            System.out.println(nums[5]);
        }
        catch(Exception e)
        {
            System.out.println("Stay in your limit");
        }
        System.out.println("Bye");
    }
}
