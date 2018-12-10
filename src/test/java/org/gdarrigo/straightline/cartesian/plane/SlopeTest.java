package org.gdarrigo.straightline.cartesian.plane;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlopeTest {

    @Test
    void itIsTheSlopeOfAStraightLine() {
        Double value = 5.0;

        Slope slope = new Slope(5.0);
        assertEquals(slope.getValue(), value);
    }
}
