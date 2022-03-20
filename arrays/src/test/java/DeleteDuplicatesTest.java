import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DeleteDuplicatesTest {

    private List<Integer> duplicates;
    private List<Integer> noDuplicates;
    private int validElements;

    @Test
    public void deleteDuplicates1() {
        duplicates = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        noDuplicates = Arrays.asList(1, 2, 3, 4, null, null, null, null, null, null);
        validElements = 4;

        test(duplicates, noDuplicates, validElements);
    }

    @Test
    public void deleteDuplicates2() {
        duplicates = Arrays.asList(1);
        noDuplicates = Arrays.asList(1);
        validElements = 1;

        test(duplicates, noDuplicates, validElements);
    }

    @Test
    public void deleteDuplicates3() {
        duplicates = Arrays.asList(1, 1, 1, 1, 1);
        noDuplicates = Arrays.asList(1, null, null, null, null);
        validElements = 1;

        test(duplicates, noDuplicates, validElements);
    }

    @Test
    public void deleteDuplicatesSerkan1() {
        duplicates = Arrays.asList(1, 2, 3, 4, 5);
        noDuplicates = Arrays.asList(1, 2, 3, 4, 5);
        validElements = 5;

        test(duplicates, noDuplicates, validElements);
    }

    @Test
    public void deleteDuplicatesSerkan2() {
        duplicates = Arrays.asList(1, 2, 3, 4, 5,5);
        noDuplicates = Arrays.asList(1, 2, 3, 4, 5,null);
        validElements = 5;

        test(duplicates, noDuplicates, validElements);
    }

    private void test(List<Integer> duplicates, List<Integer> noDuplicates, int validElements) {
        assertEquals(validElements, DeleteDuplicates.deleteDuplicates(duplicates));
        assertEquals(noDuplicates, duplicates);
    }
}