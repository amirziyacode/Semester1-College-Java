package DSA;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class HashMapTest {

    @Test
    void find_First_Char_of_String(){
        String str = "a green apple";

        char first = findFirst(str);


        assertThat(first).isEqualTo('g');

    }

    public static char findFirst(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        ConverseToHashTable(str, map);

        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i)) && map.get(str.charAt(i)) == 1){
                return str.charAt(i);
            }
        }
        return  ' ';
    }
    private static void ConverseToHashTable(String str, HashMap<Character, Integer> map) {
        for(int i = 0; i< str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }
    }
}
