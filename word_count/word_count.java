package word_count;
import java.util.*;
class word_count{
    public static void main(String args[]){
    HashMap<String, Integer> map = new HashMap<>();
    String sentence = "My home, is my home".toLowerCase();
    for(String word : sentence.split("\\W")) {
        if(word.isEmpty()) {
            continue;
        }
        if(map.containsKey(word)) {
            map.put(word, map.get(word)+1);
        }
        else {
            map.put(word, 1);
        }
    }

    for(Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
}
