package streams;

import java.util.*;

public class Anagram_Stream {
    public static Boolean isAnagram(String word1, String word2){
        List<String> listWord1 = new ArrayList<>(Arrays.asList(word1.split("")));
        List<String> listWord2 =new ArrayList<>(Arrays.asList(word2.split("")));
        Collections.sort(listWord1);
        Collections.sort(listWord2);
        word1=String.join("",listWord1);
        word2=String.join("",listWord2);
        return word1.equals(word2);


    }
    public static void main(String[] args) {
        if(isAnagram("kavya","aavky"))
            System.out.println("Anagrams");
        else {
            System.out.println("Not Anagrams");
        }
    }
}
