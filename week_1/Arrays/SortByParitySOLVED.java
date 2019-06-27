package week_1.Arrays;

/**
 * SOLVED
 */
public class SortByParitySOLVED {
    public int[] sortArrayByParity(int[] A) {
        int[] sorted = new int[A.length];
        int currentIndex = 0;
        //add all the evens
        for(int num = 0; num < A.length; num++) {
            if(A[num] % 2 == 0) {
                sorted[currentIndex] = A[num];
                currentIndex++;
            }
        }
        //add all the odds
        for(int num = 0; num < A.length; num++) {
            if(A[num] % 2 != 0) {
                sorted[currentIndex] = A[num];
                currentIndex++;
            }
        }
        return sorted;
    }
}
