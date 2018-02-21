package EncapsulationETC.Polymorphism;

abstract public class AbstractShape {
    int square;

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public abstract int calculateSquare();

}
