package ua.ucu.apps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    private ATM atm;

    @BeforeEach
    void setUp() {
        atm = new ATM();
    }

    @Test
    void testProcess1000() {
        assertDoesNotThrow(() -> atm.process(1000));
    }

    @Test
    void testProcess2200() {
        assertDoesNotThrow(() -> atm.process(2200));
    }

    @Test
    void testProcess500() {
        assertDoesNotThrow(() -> atm.process(500));
    }

    @Test
    void testProcess1765() {
        assertDoesNotThrow(() -> atm.process(1765));
    }

    @Test
    void testProcess100() {
        assertDoesNotThrow(() -> atm.process(100));
    }

    @Test
    void testProcess9999() {
        assertDoesNotThrow(() -> atm.process(9999));
    }

    @Test
    void testProcess1() {
        assertDoesNotThrow(() -> atm.process(1));
    }

    @Test
    void testProcess777() {
        assertDoesNotThrow(() -> atm.process(777));
    }

    @Test
    void testProcess3456() {
        assertDoesNotThrow(() -> atm.process(3456));
    }

    @Test
    void testProcess50() {
        assertDoesNotThrow(() -> atm.process(50));
    }
}
