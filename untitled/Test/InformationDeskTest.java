import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InformationDeskTest {
    Airport airport = new Airport("BER", "1", "a");

 /*   @Test
    void getName() {
        ArrayList<InformationDesk> informationDesks= new ArrayList<>();
        informationDesks.add(InformationDeskNames.T11, "a", "1");
        assertArrayEquals();
    }
*/
    @Test
    void informFederalPolice() {
        assertTrue(airport.getTerminal().get(0).getInformationdesk().get(0).informFederalPolice());

    }

    @Test
    void version() {
        assertEquals("id: <1> type: <a>", airport.getTerminal().get(0).getInformationdesk().get(0).version());
    }
}