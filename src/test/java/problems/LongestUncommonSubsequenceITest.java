package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestUncommonSubsequenceITest {

    LongestUncommonSubsequenceI lusb1 = new LongestUncommonSubsequenceI();

    @Test
    void findLUSlength() {
        int actual = lusb1.findLUSlength("aba", "cdc");
        assertEquals(3,actual);
    }

    @Test
    void findLUSlength1() {
        int actual = lusb1.findLUSlength("aaa", "bbb");
        assertEquals(3,actual);
    }

    @Test
    void findLUSlength2() {
        int actual = lusb1.findLUSlength("aaa", "aaa");
        assertEquals(-1,actual);
    }

    @Test
    void findLUSlength3() {
        int actual = lusb1.findLUSlength("abcd", "abc");
        assertEquals(4,actual);
    }
}