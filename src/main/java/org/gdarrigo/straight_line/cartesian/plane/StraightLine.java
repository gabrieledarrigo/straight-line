package org.gdarrigo.straight_line.cartesian.plane;

public final class StraightLine implements SlopeCalculation {
    private Point a;

    private Point b;

    public StraightLine(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    @Override
    public Slope calculateSlope() {
        return new Slope((b.getY() - a.getY()) / (b.getX() - a.getX()));
    }
}
