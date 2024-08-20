package telran.stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class StreamTasksTest {
    private static final int N_RUNS = 100;
    
    @Test
    void shuffleTest() {
        int array[] = {10, 10, 20, 30, 40, 50, 50, 70, 80, 90};
        int[] arShuffled = StreamTasks.shuffle(array);
        for (int i = 1; i < N_RUNS; i++ ) {
            int[] arShuffled2 = StreamTasks.shuffle(array);
            assertFalse(Arrays.equals(arShuffled, arShuffled2));
            arShuffled = arShuffled2;
            runTest(arShuffled, array);
        }
        
        
     }
    
    private void runTest(int[] shuffled, int[] array) {
        assertFalse(Arrays.equals(shuffled, array));
        Arrays.sort(shuffled);
        assertTrue(Arrays.equals(shuffled, array));
    }
}

