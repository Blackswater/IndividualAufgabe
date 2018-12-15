import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
    Airport airport = new Airport("BER", "1", "a");

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("BER", airport.getName());
    }

    @org.junit.jupiter.api.Test
    void getTerminal() {
        assertEquals(TerminalNames.T1,airport.getTerminal().get(0).getName());
    }

    @org.junit.jupiter.api.Test
    void getType() {
        assertEquals("a", airport.getType());
    }

    @org.junit.jupiter.api.Test
    void getId() {
        assertEquals("1", airport.getId());
    }

    @org.junit.jupiter.api.Test
    void version() {
        assertEquals("id: <1> type: <a>", airport.version());
    }
}