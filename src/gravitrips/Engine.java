package gravitrips;

import java.util.ArrayList;
import java.util.List;

public class Engine {
    private int steps;
    private int sign;

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getSign() {
        return sign;
    }
 
    public void setSign(int sign) {
        this.sign = sign;
    }

    public void countSteps() {
        steps = steps + 1;
        setSteps(steps);
    }

    public void appendSign() {
        if ((steps % 2) == 0) {
            sign = 2;
        } else {
            sign = 1;
        }
    }
}
