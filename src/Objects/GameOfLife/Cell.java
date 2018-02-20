//This is a solitary game, or one with just one player, and the play of a typical game goes like this:
//
//        Player chooses an initial set up.
//        Rules are applied to see what happens in the next generation.
//        Play continues until one of three things happens: all cells are dead, no cells change from one generation to the next, or the pattern flips back and forth between two or more positions.
//        Of course, like any game, there are rules! Here's a quick overview.
//
//        Births: Each dead cell adjacent to exactly three live neighbors will become live in the next generation.
//        Death by isolation: Each live cell with one or fewer live neighbors will die in the next generation.
//        Death by overcrowding: Each live cell with four or more live neighbors will die in the next generation.
//        Survival: Each live cell with either two or three live neighbors will remain alive for the next generation.

package Objects.GameOfLife;

public class Cell {



}
// if (colValue) {
// check if value of (Column i - 1) is true or (column i+1) == true;
// then colValue=false

// will not work since each next value will be overwritten.

