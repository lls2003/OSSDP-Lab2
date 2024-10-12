import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSolution7 {

    @Test
    public void testSmallestStringWithSwaps() {
        Solution7 solution = new Solution7();

        String s1 = "dcab";
        List<List<Integer>> pairs1 = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2));
        assertEquals("bacd", solution.smallestStringWithSwaps(s1, pairs1));

        String s2 = "dcab";
        List<List<Integer>> pairs2 = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2));
        assertEquals("abcd", solution.smallestStringWithSwaps(s2, pairs2));

        String s3 = "cba";
        List<List<Integer>> pairs3 = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2));
        assertEquals("abc", solution.smallestStringWithSwaps(s3, pairs3));
    }
}
