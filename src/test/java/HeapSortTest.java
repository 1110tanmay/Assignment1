import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HeapSortTest {

    // Case 1: Unsorted array
    @Test
    public void testHeapSortWithUnsortedArray() {
        int[] input = {4, 10, 3, 5, 1};
        int[] expected = {1, 3, 4, 5, 10};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "The unsorted array should be sorted correctly");
        System.out.println("Test case passed: Input was an unsorted array. ");
    }

    // Case 2: Empty array
    @Test
    public void testHeapSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "An empty array should remain unchanged");
        System.out.println("Test case passed: Input was an empty array. ");
    }

    // Case 3: Single-element array
    @Test
    public void testHeapSortWithSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "A single-element array should remain unchanged");
        System.out.println("Test case passed: The input was a single element array. ");
    }

    // Case 4: Array with duplicate values
    @Test
    public void testHeapSortWithDuplicateValues() {
        int[] input = {3, 1, 2, 2, 3};
        int[] expected = {1, 2, 2, 3, 3};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "The array with duplicate values should be sorted correctly");
        System.out.println("Test case passed: The input was an array of duplicate elements. ");
    }

    // Case 5: Already sorted array
    @Test
    public void testHeapSortWithAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "An already sorted array should remain unchanged");
        System.out.println("Test case passed: The input was a sorted array.");
    }

    // Case 6: Reverse-sorted array
    @Test
    public void testHeapSortWithReverseSortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "A reverse-sorted array should be sorted in ascending order");
        System.out.println("Test case passed: The input was reverse-sorted array.");
    }

    // Case 7: Array with negative numbers
    @Test
    public void testHeapSortWithNegativeValues() {
        int[] input = {-3, -1, -4, -2, 0};
        int[] expected = {-4, -3, -2, -1, 0};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "The array with negative values should be sorted correctly");
        System.out.println("Test case passed: The input was a sorted array with negative values.");
    }

    // Case 8: Large array
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
        System.out.println("Test case passed: The input was a very large array.");
    }

    // Case 9: Array with maximum integer values
    @Test
    public void testHeapSortWithMaxIntValues() {
        int[] input = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 1, -1};
        int[] expected = {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "The array with max and min int values should be sorted correctly");
        System.out.println("Test case passed: Input was a array with max and mi int values.");
    }

    // Case 10: Null array (Fails)
    @Test
    public void testHeapSortWithNullArray() {
        assertThrows(NullPointerException.class, () -> {
            HeapSort.heapSort(null); // Null array should throw an exception
        }, "Sorting a null array should throw NullPointerException");
        System.out.println("Test case passed: input was a null array.");
    }

    // Case 11: Array of size 0 but not null
    @Test
    public void testHeapSortEdgeCaseWithZeroSizedArray() {
        int[] input = new int[0];
        int[] expected = new int[0];
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input, "An empty array of size 0 should remain unchanged");
        System.out.println("Test case passed: Input was an empty array.");
    }

    // Case 12: Algorithm failure case (Modifying input directly, if any)
    @Test
    public void testHeapSortAlgorithmIntegrity() {
        int[] input = {10, 3, 15, 7, 8};
        HeapSort.heapSort(input);
        for (int value : input) {
            assertNotNull(value, "All elements must be non-null after sorting");
            System.out.println("Test case passed: non-null input.");
        }
    }
}
