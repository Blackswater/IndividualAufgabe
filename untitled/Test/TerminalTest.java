import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerminalTest {
    Airport airport = new Airport("BER", "1", "a");

    @Test
    void getName() {
        assertEquals(TerminalNames.T1, airport.getTerminal().get(0).getName());
        assertEquals(TerminalNames.T2, airport.getTerminal().get(1).getName());
        assertEquals(TerminalNames.T3, airport.getTerminal().get(2).getName());
    }

    @Test
    void getCheckIns() {
        airport.getTerminal().get(0).setCheckIns(5);
        assertEquals(5, airport.getTerminal().get(0).getCheckIns());
    }

    @Test
    void getInformationdesk() {
        assertEquals(InformationDeskNames.T11, airport.getTerminal().get(0).getInformationdesk().get(0).getName());
    }

    @Test
    void version() {
        assertEquals("id: <1> type: <a>", airport.getTerminal().get(0).version());
    }
}