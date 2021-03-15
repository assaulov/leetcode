package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClumsyFactorialTest {
    ClumsyFactorial clumsy = new ClumsyFactorial();
    @Test
    void clumsy() {
        int n = clumsy.clumsy(4);
        assertEquals(7,n);


    }

    @Test
    void clumsy2() {
        int n = clumsy.clumsy(10);
        assertEquals(12,n);


    }
}