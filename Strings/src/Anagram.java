import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for(char c : s2.toCharArray()){
            map.put(c,map.getOrDefault(c,0) - 1);

            if(map.get(c) < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";

        System.out.println(isAnagram(s1,s2));
    }
}
