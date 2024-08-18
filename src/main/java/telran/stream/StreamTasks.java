package telran.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamTasks {
    public static int[] shuffle(int[] arr) {
        Random random = new Random();
        return IntStream.range(0, arr.length).map(i -> arr[random.nextInt(arr.length)]).toArray();
    }
}
