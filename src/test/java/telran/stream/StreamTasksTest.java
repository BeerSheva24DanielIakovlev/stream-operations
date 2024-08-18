package telran.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class StreamTasksTest {

    @Test
    void shuffleTest() {
        int[] original = {1, 2, 3, 4, 5};
        int[] shuffled = StreamTasks.shuffle(original);

        assertEquals(original.length, shuffled.length);

        Set<Integer> originalSet = new HashSet<>();
        for (int num : original) {
            originalSet.add(num);
        }

        Set<Integer> shuffledSet = new HashSet<>();
        for (int num : shuffled) {
            shuffledSet.add(num);
        }

        boolean isShuffled = !Arrays.equals(original, shuffled);
        assertTrue(isShuffled);

        int[] shuffledAgain = StreamTasks.shuffle(original);
        assertFalse(Arrays.equals(shuffled, shuffledAgain));
    }
}

