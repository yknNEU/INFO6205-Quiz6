import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testUnsortedIntegerArray() {
        Integer[] arr = {64, 25, 12, 22, 11};
        Integer[] expected = {11, 12, 22, 25, 64};
        QuickSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortedIntegerArray() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        QuickSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testReverseSortedIntegers() {
        Integer[] arr = {9, 7, 5, 3, 1};
        Integer[] expected = {1, 3, 5, 7, 9};
        QuickSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testDuplicateValues() {
        Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Integer[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        QuickSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testEmptyArray() {
        Integer[] arr = {};
        Integer[] expected = {};
        QuickSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSingleElementArray() {
        Integer[] arr = {42};
        Integer[] expected = {42};
        QuickSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testNegativeNumbers() {
        Integer[] arr = {-5, -1, -3, -2, -4};
        Integer[] expected = {-5, -4, -3, -2, -1};
        QuickSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testStringArray() {
        String[] arr = {"orange", "apple", "banana", "grape"};
        String[] expected = {"apple", "banana", "grape", "orange"};
        QuickSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testAllIdenticalElements() {
        Integer[] arr = {7, 7, 7, 7, 7};
        Integer[] expected = {7, 7, 7, 7, 7};
        QuickSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMixedNumbers() {
        Integer[] arr = {3, -2, 0, 5, -1, 4};
        Integer[] expected = {-2, -1, 0, 3, 4, 5};
        QuickSort.sort(arr);
        assertArrayEquals(expected, arr);
    }
}

