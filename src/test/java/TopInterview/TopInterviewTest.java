package TopInterview;
import DSA.PriorityQueue;
import DSA.StackQueue;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.assertj.core.api.Assertions.*;

public class TopInterviewTest {
    @Test
    public void check_last_word() {
        String word = "   fly me   to   the moon  ";
        String word2 = "Hello World";
        String word3 = "luffy is still joyboy";
        String word5 = "a";
        assertThat(lastWord(word2)).isEqualTo(5);
        assertThat(lastWord(word)).isEqualTo(4);
        assertThat(lastWord(word3)).isEqualTo(6);
        assertThat(lastWord(word5)).isEqualTo(1);
    }

    @Test
    void is_Valid_Parentheses() {
       assertThat( isValid("()")).isTrue();
       assertThat(isValid("()[]{}")).isTrue();
       assertThat(isValid("(]")).isFalse();
       assertThat(isValid("([)]")).isFalse();
    }

    @Test
    void check_List_To_int() {
        assertThat(plusOne(new int[]{1,2,3})).containsExactly(1,2,4);
        assertThat(plusOne(new int[]{4,3,2,1})).containsExactly(4,3,2,2);
        assertThat(plusOne(new int[]{9})).containsExactly(1,0);
    }

    @Test
    void revers_Queue(){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        Revers(queue);
    }

    @Test
    void longest_Prefix(){
        String[] names = {"flower","flow","flower"};
        String flower = "flower";
        String substring = flower.substring(0, flower.length() - 1);
        System.out.println(substring);
        assertThat(longestCommonPrefix(names)).isEqualTo("flow");
    }


    @Test
    void make_Queue_By_Stack(){
        StackQueue stackQueue = new StackQueue();
        stackQueue.enqueue(10);
        stackQueue.enqueue(20);
        stackQueue.enqueue(30);
        stackQueue.enqueue(40);
        stackQueue.dequeue();
        stackQueue.dequeue();
        System.out.println(stackQueue);
    }

    @Test
    void PriorityQueue_Test(){
        PriorityQueue priorityQueue = new PriorityQueue(4);
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(3);

        System.out.println(priorityQueue);
    }

    @Test
    void canConstruct_Test(){
        String ransomNote = "a";
        String magazine = "b";
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        String ransomNote4 = "aab";
        String magazine4 = "baa";
        String ransomNote5 = "fihjjjjei";
        String magazine5 = "hjibagacbhadfaefdjaeaebgi";
        String ra = "bg";
        String ma = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";

        assertThat(canConstruct(ra,ma)).isTrue();
        assertThat(canConstruct(ransomNote,magazine)).isFalse();
        assertThat(canConstruct(ransomNote2,magazine2)).isFalse();
        assertThat(canConstruct(ransomNote3,magazine3)).isTrue();
        assertThat(canConstruct(ransomNote4,magazine4)).isTrue();
        assertThat(canConstruct(ransomNote5,magazine5)).isFalse();
    }

    @Test
    void sort_array_with_selection(){
        int[] arr = {63,25,22,12,11};

        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
        assertThat(arr).containsExactly(11,12,22,25,63);
    }

    public static void  SelectionSort(int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++; // index char of english word !!

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
    public static String longestCommonPrefix(String[] str) {
        if(str.length == 0) return "";
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
    public static void Revers(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        System.out.println(queue);
    }
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            if(c == ')' || c == '}' || c == ']'){
                if (stack.isEmpty()) return false;
                if(c == ')' && stack.pop() != '(' || c == ']' && stack.pop() != '[' || c == '}' && stack.pop() != '{' ) return false;

            }

        }

        
        return  stack.isEmpty();
    }
    public static int lastWord(String word){
        String noneSpace = word.trim();
        for (int i = noneSpace.length() -1; i>=0; i--){
            if(noneSpace.charAt(i) == ' '){
                return (noneSpace.length()-1) - i;
            }
        }
        return  noneSpace.length();
    }
}
