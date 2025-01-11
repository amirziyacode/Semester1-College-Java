import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.*;
import static java.nio.charset.StandardCharsets.UTF_8;

@SuppressWarnings("resource")
public class InputTest {

    public static final String FILE_NAME = "text.txt";
    public static final  String SENTENCE = "Java";
    @Test
    public void input(){
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
            fileOutputStream.write(SENTENCE.getBytes(UTF_8));
            fileOutputStream.write(" foll".getBytes(UTF_8));
            FileInputStream fileInputStream = new FileInputStream("text.txt");
            int read;
            while (  (read = fileInputStream.read()) != -1) {
                out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
