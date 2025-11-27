package ua.ucu.apps;

import org.junit.jupiter.api.Test;

class ATMTest {

    @Test
    void testATM() {
        ATM atm = new ATM();
        atm.process(2200);
    }
}
