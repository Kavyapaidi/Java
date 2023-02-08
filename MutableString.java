import java.lang.*;
public class MutableString {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Kavya ");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.insert(6,"Java "));
        System.out.println(sb.insert(11,1));
        System.out.println(sb.append(2));

        System.out.println(sb.replace(1,4,"java"));
        System.out.println(sb.delete(1,4));
        System.out.println(sb.reverse());
        System.out.println(sb);

    }
}
