package circus.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    void speak() {
        Bird duck = new Duck("Scrooge");
        assertEquals("I'm Scrooge. I am a Duck!  Quack Quack", duck.speak());
    }

    @Test
    void getValue() {
        Bird duck = new Duck("Scrooge");
        assertEquals(10, duck.getValue());
    }
}