package array;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> anag(String[] list) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : list) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        String[] strs2 = {""};

        System.out.println(anag(strs));
    }
}
