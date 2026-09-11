package circus.equipment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LadderTest {

    @org.junit.jupiter.api.Test
    void getValue_returnsHalfOfPurchasePrice() {
        assertEquals(50, new Ladder(100).getValue());
    }

    @org.junit.jupiter.api.Test
    void getValue_isNotEqualToPurchasePrice() {
        assertNotEquals(100, new Ladder(100).getValue());
    }
}