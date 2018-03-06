package EncapsulationETC.Polymorphism;

public class Triangle extends AbstractShape {
    private int sideA;
    private int sideB;
    private int sideC;
    private int s;

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public int calculateSquare() {
        s = (sideA + sideB + sideC) / 2;
        super.square = (int) Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        setSquare(square);
        return square;
    }
}
