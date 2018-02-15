//        1. Player chooses an initial set up.
//        2. Rules are applied to see what happens in the next generation.
//        3. Play continues until one of three things happens: all cells are dead, no cells change from one generation to the next, or the pattern flips back and forth between two or more positions.
//
//
//        Rules for Conway's Game of Life:
//        At the heart of this game are four rules that determine if a cell is live or dead. All depend on how many of that cell's neighbors are alive.
//
//        1. Births: Each dead cell adjacent to exactly three live neighbors will become live in the next generation.
//        2. Death by isolation: Each live cell with one or fewer live neighbors will die in the next generation.
//        3. Death by overcrowding: Each live cell with four or more live neighbors will die in the next generation.
//        4. Survival: Each live cell with either two or three live neighbors will remain alive for the next generation.


package Objects.GameOfLife;

import java.util.Random;

public class Life {

    public int numberOfCells;
    public boolean[][] field;
    public int generation;
    int row;
    int column;
    Random random = new Random();

    public Life(int numberOfCells){
        this.numberOfCells = numberOfCells;
        initialSetup();
        this.generation = 0;
    }

    // set


    //get


    // methods

    public void initialSetup() {
        field = new boolean[numberOfCells][numberOfCells];
        for (row = 0; row < field.length; row++) {
            for (column = 0; column < field[row].length; column++) {
                field[row][column] = random.nextBoolean();
            }
        }
    }

    public void generateWorld() {
        System.out.println("Generation " + generation);
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print(field[row][col] ? '■' : '□');
                System.out.print(' ');
            }
            System.out.println();
        }


    }
}