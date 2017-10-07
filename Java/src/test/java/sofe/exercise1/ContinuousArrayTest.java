package sofe.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContinuousArrayTest {

    /**
     *
     */
    @Test
    public void testAlmostIncreasingSequenceOne() {
        int array[] = {-30, -19, 123, -17, -5, 1, 2, 3, 12, 43, 45} ;
        boolean isSequence = ContinuousArray.isAlmostIncreasingSequence(array);
        assertEquals(true, isSequence);

    }

    @Test
    public void testAlmostIncreasingSequenceTwo() {
        int array[] = {1, 2, 3, 6, 3, 7};
        boolean isSequence = ContinuousArray.isAlmostIncreasingSequence(array);
        assertEquals(true, isSequence);
    }

    @Test
    public void testAlmostIncreasingSequenceThree() {
        int array[] = {10, 1, 2, 3, 4, 5, 6, 1};
        boolean isSequence = ContinuousArray.isAlmostIncreasingSequence(array);
        assertEquals(false, isSequence);
    }

    @Test
    public void testAlmostIncreasingSequenceFour() {
        int array[] = {-127, -64, -50, -10, 2, 4, 5, 6, 7, 8, 12, 16, 40};
        boolean isSequence = ContinuousArray.isAlmostIncreasingSequence(array);
        assertEquals(true, isSequence);
    }

}
