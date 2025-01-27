import static org.junit.jupiter.api.Assertions.*; // For assertions
import org.junit.jupiter.api.Test; // For @Test annotation

public class HeapSortTest {

    @Test
    public void testHeapSortWithUnsortedArray() {
        int[] input = {4, 10, 3, 5, 1};
        int[] expected = {1, 3, 4, 5, 10};
        HeapSort.heapSort(input); // Call the method to sort
        assertArrayEquals(expected, input, "The unsorted array should be sorted correctly");
    }

    @Test
    public void testHeapSortWithEmptyArray() {
        int[] input = {}; // Empty array
        int[] expected = {}; // Empty array remains unchanged
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "An empty array should remain unchanged");
    }

    @Test
    public void testHeapSortWithSingleElementArray() {
        int[] input = {42}; // Single element
        int[] expected = {42}; // Single element remains unchanged
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "A single-element array should remain unchanged");
    }

    @Test
    public void testHeapSortWithDuplicateValues() {
        int[] input = {3, 1, 2, 2, 3};
        int[] expected = {1, 2, 2, 3, 3};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "The array with duplicate values should be sorted correctly");
    }

    @Test
    public void testHeapSortWithAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5}; // Already sorted array
        int[] expected = {1, 2, 3, 4, 5};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "An already sorted array should remain unchanged");
    }

    @Test
    public void testHeapSortWithReverseSortedArray() {
        int[] input = {5, 4, 3, 2, 1}; // Reverse-sorted array
        int[] expected = {1, 2, 3, 4, 5};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "A reverse-sorted array should be sorted in ascending order");
    }

    @Test
    public void testHeapSortWithNegativeValues() {
        int[] input = {-3, -1, -4, -2, 0}; // Array with negative values
        int[] expected = {-4, -3, -2, -1, 0};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "The array with negative values should be sorted correctly");
    }

    @Test
    public void testHeapSortWithLargeArray() {
        int[] input = new int[1000];
        int[] expected = new int[1000];
        for (int i = 0; i < 1000; i++) {
            input[i] = 1000 - i; // Reverse order
            expected[i] = i + 1; // Ascending order
        }
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "A large array should be sorted correctly");
    }
}
