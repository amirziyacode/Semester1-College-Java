package DSA;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddBin {


    @Test
    void testAddBin() {
        String a = "1";
        String b = "11";


        Assertions.assertThat(addBin(a, b)).isEqualTo("100");
    }


    public String addBin(String a, String b) {
        String result = a + b; // 111
        for (int i=result.length() -1; i>0; i--) {
            if(result.charAt(i) == '1' && result.charAt(i-1) != '1') {
//               result.charAt(i) = '0';
            }
        }
        return result;
    }
}