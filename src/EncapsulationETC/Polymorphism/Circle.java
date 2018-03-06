package EncapsulationETC.Polymorphism;

public class Circle extends AbstractShape{
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculateSquare() {
        super.square = radius*radius;
        setSquare(square);
        return square;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", square=" + square +
                '}';
    }


}
