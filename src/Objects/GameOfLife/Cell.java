//        1. Births: Each dead cell adjacent to exactly three live neighbors will become live in the next generation.
//        2. Death by isolation: Each live cell with one or fewer live neighbors will die in the next generation.
//        3. Death by overcrowding: Each live cell with four or more live neighbors will die in the next generation.
//        4. Survival: Each live cell with either two or three live neighbors will remain alive for the next generation.


package Objects.GameOfLife;

public class Cell {

    public boolean alive;

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean getAlive() {
        return alive;
    }


}
