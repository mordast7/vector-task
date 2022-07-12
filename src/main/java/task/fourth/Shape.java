package task.fourth;

public class Shape implements Comparable<Shape> {
    private final double area;

    public Shape(final double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(final Shape other) {
        return Double.compare(this.area, other.area);
    }
}
