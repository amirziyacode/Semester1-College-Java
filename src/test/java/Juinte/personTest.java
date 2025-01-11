package Juinte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class personTest {

    @Test
    void check_person() {
        person person = new person("Amir",20);
        assertAll("Check Person !",() -> {
          assertEquals("Amir", person.getName());
          assertEquals(20, person.getAge());
        });
    }
}