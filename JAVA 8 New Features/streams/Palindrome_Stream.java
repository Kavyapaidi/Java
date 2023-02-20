package streams;

import java.util.stream.IntStream;

public class Palindrome_Stream {
    public static void main(String[] args) {
        String str="App  l e";
        String str1="R    adA r";
        //matches sequence of one or more whitespace characters with empty strings
        //and then converting into lowercase
        String tempstr=str1.replaceAll("\\s+","").toLowerCase();
        boolean reversedstr= IntStream.range(0,tempstr.length()/2)
                .noneMatch(i->tempstr.charAt(i)!=tempstr.charAt(tempstr.length()-i-1));
        if(reversedstr==true)
            System.out.println("palindrome");
        else {
            System.out.println("not a palindrome");
        }
    }
}
