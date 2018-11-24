package org.gdarrigo.cartesian.plane;

import org.gdarrigo.straight_line.cartesian.plane.Point;
import org.gdarrigo.straight_line.cartesian.plane.StraightLine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StraightLineTest {

    @Test
    void itIsAStraightLineDefinedByTwoPointsInTheCartesianPlane() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);

        StraightLine straightLine = new StraightLine(a, b);

        assertEquals(straightLine.getA(), a);
        assertEquals(straightLine.getB(), b);
    }
}
