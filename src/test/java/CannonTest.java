import circus.equipment.Cannon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CannonTest {

    @Test
    void getValue_returnsOneThirdOfPurchasePrice() {
        assertEquals(33, new Cannon(99).getValue());
    }

    @Test
    void getValue_isNotEqualToPurchasePrice() {
        assertNotEquals(99, new Cannon(99).getValue());
    }
}