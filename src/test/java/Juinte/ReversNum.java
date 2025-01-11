package Juinte;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ReversNum {
    @Test
    public void test1() {
        int num = 987654321;
        int newNum = 0;
        while (num != 0) {
            int last = num % 10;
            newNum = newNum*10 + last;
            num = num /10;
        }
        assertThat(newNum).isEqualTo(123456789);
    }

    @Test
    public void test2() {
        int num = 987654321;
        int newNum = 0;
        String nums = String.valueOf(num);
        for(int i = nums.length() - 1; i >= 0; i--) {
            newNum = newNum*10 + nums.charAt(i) - '0';
        }
        assertThat(newNum).isEqualTo(123456789);
    }
}
