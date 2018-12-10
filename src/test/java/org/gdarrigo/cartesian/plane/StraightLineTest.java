package org.gdarrigo.cartesian.plane;

import org.gdarrigo.straight_line.cartesian.plane.Point;
import org.gdarrigo.straight_line.cartesian.plane.StraightLine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StraightLineTest {
    private Point a;
    private Point b;
    private StraightLine straightLine;

    @BeforeEach
    void setUp() {
        a = new Point(1.0, 2.0);
        b = new Point(3.0, 4.0);
    }

    @Test
    void itIsAStraightLineDefinedByTwoPointsInTheCartesianPlane() {
        straightLine = new StraightLine(a, b);

        assertEquals(straightLine.getA(), a);
        assertEquals(straightLine.getB(), b);
    }

    @Test
    void itShouldCalculateAFiniteSlope() {
        straightLine = new StraightLine(a, b);

        Double expected = (b.getY() - a.getY()) / (b.getX() - a.getX());
        assertEquals(expected, straightLine.calculateSlope().getValue());
    }

    @Test
    void itShouldReturnAnInfiniteSlopeIfTheDeltaXIsZero() {
        Point a = new Point(0.0, 2.0);
        Point b = new Point(0.0, 4.0);

        straightLine = new StraightLine(a, b);
        assertEquals(Double.POSITIVE_INFINITY, straightLine.calculateSlope().getValue().doubleValue());
    }
}
