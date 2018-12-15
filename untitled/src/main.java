import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Airport airport = new Airport("1","a");
        System.out.println(airport.version());
        System.out.println(airport.getTerminal().get(0).getName());
        System.out.println(airport.getTerminal().get(1).getName());
        System.out.println(airport.getTerminal().get(2).getName());
        System.out.println("InformationsDesK: " + airport.getTerminal().get(0).getInformationdesk().get(0) + "\nTerminal: " + airport.getTerminal().get(0).getName());

    }
}
