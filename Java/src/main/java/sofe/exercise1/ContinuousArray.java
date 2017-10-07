package sofe.exercise1;

public class ContinuousArray {

    public static boolean isAlmostIncreasingSequence(int[] sequence) {
        int c = 0;
      
        for (int i = 0; i < sequence.length -1; i++) {
            if (sequence[i] < sequence[i + 1]) {

            } else {
                c++;

            }

        }
        if (c <= 1) {
            return true;
        } else {
            return false;
        }
    }

}
