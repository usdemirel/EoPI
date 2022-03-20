import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EnumeratePrimesTest {

    private List<Integer> primes;
    private int n;

    @Test
    public void enumeratePrimes1() {
        primes = Arrays.asList();
        n = 1;

        test(primes, n);
    }

    @Test
    public void enumeratePrimes2() {
        primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17);
        n = 18;

        test(primes, n);
    }

    @Test
    public void enumerateSerkan1() {
        primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        n = 100;

        test(primes, n);
    }

    void test(List<Integer> primes, int n) {
        assertEquals(primes, EnumeratePrimes.enumeratePrimes(n));
    }

}