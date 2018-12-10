package org.gdarrigo.cartesian.plane;

import org.gdarrigo.straight_line.cartesian.plane.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void itIsAPointInTheCartesianPlaneWithAnAbscissaAndAnOrdinate() {
        Double x = 10.0;
        Double y = 7.0;

        Point point = new Point(x, y);

        assertEquals(point.getX(), x);
        assertEquals(point.getY(), y);
    }
}
