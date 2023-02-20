package streams;

import java.util.stream.IntStream;

public class Palindromes_Stream {
    public static boolean isPalindrome(String str){
    String tempstr=str.replaceAll("\\s+","").toLowerCase();
    return IntStream.range(0,tempstr.length()/2)
            .noneMatch(i->tempstr.charAt(i)!=tempstr.charAt(tempstr.length()-i-1));}
    public static void main(String[] args) {
        String[] str={"kavya","radar","mom","lavs"};
        for(String s:str)
            System.out.println(isPalindrome(s));
    }
}
