package DSA;
import org.junit.jupiter.api.Test;
import java.util.Stack;
import static org.assertj.core.api.Assertions.*;

public class DataStructureTest {
    @Test
    void check_Parasites_Stack() {
        String check = "( 1 + 2 )";
        String check2 = "{ 1 + 2 }";
        String check3 = "[ 1 + 2 ]";

        assertThat(isBalanced(check)).isTrue();
        assertThat(isBalanced(check2)).isTrue();
        assertThat(isBalanced(check3)).isTrue();
    }

    @Test
    void check_Roman_To_Integer() {
        String roman = "MCMXCIV";
        String roman2 = "III";
        String roman3 = "DCXXI";
        assertThat(Roman(roman)).isEqualTo(1994);
        assertThat(Roman(roman3)).isEqualTo(621);
        assertThat(Roman(roman2)).isEqualTo(3);
    }
    @Test
    void Building_A_Stack() {
        StackBuild stack = new StackBuild(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println(stack);
        assertThat(stack.isEmpty()).isFalse();
        assertThat(stack.peek()).isEqualTo(3);
    }


    @Test
    void Building_A_Queue() {
        ArrayQueue arrayQueue = new ArrayQueue(4);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);

        arrayQueue.dequeue();
        assertThat(arrayQueue.isEmpty()).isFalse();
//        assertThat(arrayQueue.isFull()).isTrue();

        System.out.println(arrayQueue);
    }


    @Test
    void check_isAnagram(){
        String s = "anagram";
        String t = "nagaram";

        assertThat(isString(s,t)).isTrue();
    }

    public boolean isString (String s,String t){
        System.out.println(s.codePoints());
        System.out.println(t.codePoints());
        return true;
    }


    private  int translate(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
    public  int Roman(String s) {
        int sum = 0;
       int cur   = translate(s.charAt(0));
        for (int i =1 ; i < s.length(); i++) {
            int next = translate(s.charAt(i));
            if( cur < next ) sum -= cur;
             else sum += cur;


            cur = next;
        }
        sum += cur;
        return sum;
    }
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            num = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> num;
            };
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
    public  static  boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == '[') {
                stack.push(c);
            } else if (c == '{') {
                stack.push(c);
            }
            if (c == ')') {
                stack.pop();
            } else if (c == ']') { stack.pop(); }
            else if (c == '}') { stack.pop(); }

        }
        return stack.isEmpty();
        }
}
