package week_1.Arrays;

/**
 * I keep getting an outOfBounds Exception for some reason at row 17.
 */
public class TransposeAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        int resRow = 0;
        int resCol = 0;
        for(int rowA = 0; rowA < A.length; rowA++) {
            for(int colA = 0; colA < A[0].length; colA++) {
                // int current = ;
                if(A[rowA][colA] == 0) {
                    result[resRow][resCol] = 1;
                } else {
                    result[resRow][resCol] = 0;
                }

                resRow++;
                resCol++;
            }
        }
        return result;
    }
}
