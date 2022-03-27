import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class SampleOfflineDataTest {

    private int k;
    private List<Integer> input = new ArrayList<>();

    @Test
    public void randomSampling1() {
        k = 3;
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        input.addAll(data);
        test(k, input);
    }

    @Test
    public void randomSampling2() {
        k = 3;
        List<Integer> data = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        input.addAll(data);

        test(k, input);
    }

    @Test
    public void randomSampling3() {
        k = 5;
        List<Integer> data = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);
        input.addAll(data);
        test(k, input);
    }

    private void test(int k, List<Integer> input) {
        final int end = input.size();
        final List<Integer> inputCopy = input.stream().collect(Collectors.toList());
        List<Integer> original = inputCopy.subList(end - k,end);
        SampleOfflineData.randomSampling(k, input);
        final List<Integer> result = input.subList(end - k,end);
        assertNotEquals(original, result);
        assertEquals(end, input.size());
        for (Integer i : inputCopy) {
            assertTrue(input.contains(i));
            input.remove(i);
        }
        assertEquals(input.size(),0);

    }

}