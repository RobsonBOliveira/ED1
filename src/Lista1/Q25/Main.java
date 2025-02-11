package Lista1.Q25;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String word = "casa";

        HashMap<Character, Integer> hashMap = countLetters(word);
        System.out.println(hashMap);

    }
    public static HashMap<Character, Integer> countLetters(String word){
        String str = word.toLowerCase();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(Character c : str.toCharArray()){
            if(c != ' ') {
                hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
            }
        }
        return hashMap;
    }
}
