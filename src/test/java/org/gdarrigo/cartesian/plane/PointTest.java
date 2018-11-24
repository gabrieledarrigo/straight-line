package org.gdarrigo.cartesian.plane;

import org.gdarrigo.straight_line.cartesian.plane.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void itIsAPointInTheCartesianPlaneWithAnAbscissaAndAnOrdinate() {
        Integer x = 10;
        Integer y = 7;

        Point point = new Point(10, 7);

        assertEquals(point.getX(), x);
        assertEquals(point.getY(), y);
    }
}
