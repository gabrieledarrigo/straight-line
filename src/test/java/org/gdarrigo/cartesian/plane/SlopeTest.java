package org.gdarrigo.cartesian.plane;

import org.gdarrigo.straight_line.cartesian.plane.Slope;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlopeTest {

    @Test
    void itIsTheSlopeOfAStraightLine() {
        Integer value = 5;

        Slope slope = new Slope(5);
        assertEquals(slope.getValue(), value);
    }
}
