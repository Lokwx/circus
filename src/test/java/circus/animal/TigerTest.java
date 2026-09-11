package circus.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TigerTest {

    @Test
    void getValue() {
        Animal tiger = new Tiger("Pi");
        assertEquals(tiger.getValue(), 100);
    }
}