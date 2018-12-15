import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Airport airport = new Airport("BER","1","a");


        System.out.println(airport.version());
        System.out.println(airport.getTerminal().get(0).getName());
        System.out.println(airport.getTerminal().get(1).getName());
        System.out.println(airport.getTerminal().get(2).getName());
        System.out.println("InformationsDesK: " + airport.getTerminal().get(0)
                .getInformationdesk().get(3).getName()
                + "\nTerminal: " + airport.getTerminal().get(0).getName());
        airport.getTerminal().get(0).getInformationdesk().get(0).informFederalPolice();
        System.out.println("Version des Airports: " + airport.getName()+" "+ airport.version());
        System.out.println("Version des Terminals: " + airport.getTerminal().get(0).getName() + " "  + airport.getTerminal().get(0).version());
        System.out.println("Vernion des InformationsDesk: " + airport.getTerminal().get(0).getInformationdesk().get(0).getName() +" " + airport.getTerminal().get(0).getInformationdesk().get(0).version());



    }
}
