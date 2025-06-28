import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    public void testElementFound() {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        assertEquals(4, BinarySearch.binarySearch(array, 10));
    }

    @Test
    public void testElementNotFound() {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        assertEquals(-1, BinarySearch.binarySearch(array, 11));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        assertEquals(-1, BinarySearch.binarySearch(array, 10));
    }

    @Test
    public void testNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            BinarySearch.binarySearch(null, 10);
        });
    }

    @Test
    public void testSingleElementFound() {
        int[] array = {10};
        assertEquals(0, BinarySearch.binarySearch(array, 10));
    }

    @Test
    public void testSingleElementNotFound() {
        int[] array = {10};
        assertEquals(-1, BinarySearch.binarySearch(array, 20));
    }
}
