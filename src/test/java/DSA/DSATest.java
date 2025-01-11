package DSA;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class DSATest {

    @Test
    void Search_List(){
        int[] numbers = {1,3,5,6};
        int flag1 = searchList(numbers,7);
        int flag2 = searchList(numbers,5);
        int flag3 = searchList(numbers,2);
        assertThat(flag1).isEqualTo(4);
        Assertions.assertThat(flag2).isEqualTo(2);
        assertThat(flag3).isEqualTo(1);


    }

    @Test
    void check_isPalindrome(){
        int number = 121;  // 100 , 20 , 1
        int number2 = -121;
        int number3 = 10;

    }


    @Test
    void check_addTwoNumbers(){
        int[] l1 = {2,4,3};
        int[] l2 = {5,6,4};
        int[] check = addTwoNumbers(l1, l2);

        int[] l3 = {0};
        int[] l4 = {0};
        int[] check2 = addTwoNumbers(l3, l4);


        int[] l5 = {9,9,9,9,9,9,9};
        int[] l6 = {9,9,9,9};
        int[] check3 = addTwoNumbers(l5, l6);

        assertThat(check).containsExactly(7,0,8);
        assertThat(check2).containsExactly(0);
        assertThat(check3).containsExactly(8,9,9,9,0,0,0,1);

    }

    public static int[] addTwoNumbers(int[] l1, int[] l2){ // [2,4,3] revers => [3,4,2] => 342
        StringBuilder number1 = new StringBuilder();
        StringBuilder number2 = new StringBuilder();


        forRevers(l1, number1);
        forRevers(l2, number2);

        int Plus = Integer.parseInt(number1.toString()) + Integer.parseInt(number2.toString()); // 807

        String resultS = String.valueOf(Plus); // "807"
        char[] charArrayResult = resultS.toCharArray(); // ["8","7","0"]
        String number = String.valueOf(charArrayResult); // "870"
        int numberInt = Integer.parseInt(number);  // 870

        return Int_to_array(numberInt); // [0,7,8]
    }

    private static int[] Int_to_array(int n) {
        int i = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while(n!=0) {
            arr[i] = n%10;
            n=n/10;
            i++;
        }
        return arr;
    }

    private static void forRevers(int[] numbs, StringBuilder number1) {
        for (int i = numbs.length -1; i >= 0; i--) {
            number1.append(numbs[i]);
        }
    }


    private int searchList(int[] nums,int target) {

        int first = 0;
        int last = nums.length -1 ;

        while(first <= last){
            int mid = (first + last)/2;  // 1
            if (target == nums[mid]){
                return mid;
            }
            else if (target > nums[mid]){
                first= mid + 1;
            }else {
                last = mid - 1;
            }
        }
       return first;
    }
    public boolean isPalindrome(int x) {

        return  false;
    }
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {

      }
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next; }
    }
}
