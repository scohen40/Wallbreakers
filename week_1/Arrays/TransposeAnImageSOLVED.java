package week_1.Arrays;

/**
 * SOLVED
 */
public class TransposeAnImageSOLVED {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] result = new int[A.length][A[0].length];
        for(int rowA = 0; rowA < A.length; rowA++) {
            for(int colA = 0; colA < A[0].length; colA++) {
                if(A[rowA][colA] == 0) {
                    result[rowA][A[rowA].length - 1 - colA] = 1;
                } else {
                    result[rowA][A[rowA].length - 1 - colA] = 0;
                }
            }
        }
        return result;
    }
}
