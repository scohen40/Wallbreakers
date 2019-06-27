package week_1.Arrays;

/**
 * SOLVED
 */
public class TransposeMatrixSOLVED {
    public int[][] transpose(int[][] A) {
        //I'm just going to assume that the rows are all the same length, from the examples shown...
        int[][] transposed = new int[A[0].length][A.length];
        for(int rowA = 0; rowA < A.length; rowA++) {
            for(int colA = 0; colA < A[0].length; colA++) {
                transposed[colA][rowA] = A[rowA][colA];
            }
        }
        return transposed;
    }
}
