package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestUncommonSubsequenceIITest {

    LongestUncommonSubsequenceII lusII = new LongestUncommonSubsequenceII();

    @Test
    void findLUSlength() {
    int actual = lusII.findLUSlength(new String[] {"aba", "cdc", "eae"});
    assertEquals(3, actual);
    }

    @Test
    void findLUSlength1() {
        int actual = lusII.findLUSlength(new String[] {"bd", "e", "abc", "ab", "abc"});
        assertEquals(2, actual);
    }
}