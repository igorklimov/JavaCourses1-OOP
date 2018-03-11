package gravitrips;

public class Field {
    private int[][] field = new int[7][7];

    public void setField(int i) {
         this.field = field;
    }

    public int[][] getField() {
        return field;
    }

    public void printField () {
        getField();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
//                field[i][j] = 0;
                setField(field[i][j]);
                System.out.println(field[i][j]);
            }
        }
    }



}
