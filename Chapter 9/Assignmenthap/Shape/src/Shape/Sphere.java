package Shape;

public class Sphere extends ThreeDimensionalShape {
    private double pi = 3.14159265359;

    public double Area() {

    return 4 * pi * (radius * radius);
    }
}