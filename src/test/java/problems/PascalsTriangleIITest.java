package problems;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleIITest {
    PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();


    @Test
    void getRow() {
        List<Integer> actual = pascalsTriangleII.getRow(3);
        List<Integer> expected = Arrays.asList(1, 3, 3, 1);
        assertEquals(expected, actual);
    }

    @Test
    void getRow1() {
        List<Integer> actual = pascalsTriangleII.getRow(0);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, actual);
    }

    @Test
    void getRow2() {
        List<Integer> actual = pascalsTriangleII.getRow(1);
        List<Integer> expected = Arrays.asList(1,1);
        assertEquals(expected, actual);
    }
    @Test
    void getRow3() {
        List<Integer> actual = pascalsTriangleII.getRow(30);
        List<Integer> expected = Arrays.asList(1,30,435,4060,27405,142506,593775,2035800,5852925,14307150,30045015,54627300,86493225,119759850,145422675,155117520,145422675,119759850,86493225,54627300,30045015,14307150,5852925,2035800,593775,142506,27405,4060,435,30,1);
        assertEquals(expected, actual);
    }
}