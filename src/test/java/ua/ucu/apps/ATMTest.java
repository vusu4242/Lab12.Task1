package ua.ucu.apps;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ATMTest {
    private ATM atm;

    @BeforeEach
    void setUp() {
        atm = new ATM();
    }

    @Test
    void testSimpleAmount() {
        assertDoesNotThrow(() -> atm.process(1000));
    }

    @Test
    void testComplexAmount() {
        assertDoesNotThrow(() -> atm.process(2765));
    }

    @Test
    void testLargeAmount() {
        assertDoesNotThrow(() -> atm.process(9999));
    }

    @Test
    void testSmallAmount() {
        assertDoesNotThrow(() -> atm.process(1));
    }

    @Test
    void testMultipleDenominations() {
        assertDoesNotThrow(() -> atm.process(2200));
    }
}