import java.util.Arrays;

/**
 * Prindi konsooli 9x9 maatriks sudoku numbritega.
 */
public class Maatriks {
    public static void main(String[] args) {
        int[][] sudoku = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j]= (int)(Math.random()*10);


            }System.out.println(Arrays.toString(sudoku[i]));

        }System.out.println(sudoku[0][0]);

    }
}

