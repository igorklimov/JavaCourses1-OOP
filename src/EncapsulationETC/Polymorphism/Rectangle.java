package EncapsulationETC.Polymorphism;

public class Rectangle extends AbstractShape{
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }


    @Override
    public int calculateSquare() {
        super.square = sideA * sideB;
        setSquare(square);
        return square;

    }
}
