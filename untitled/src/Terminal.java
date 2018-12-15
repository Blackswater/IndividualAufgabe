import java.util.ArrayList;

public class Terminal implements ITerminal {

    private TerminalNames name;
    private int checkIns;
//    private Employee[] employee;
    private String type;
    private String id;
    private Airport airport;
    private ArrayList<InformationDesk> informationdesk = new ArrayList<InformationDesk>();


    public Terminal(TerminalNames name, String type, String id, Airport airport) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.airport = airport;
        informationdesk.add(new InformationDesk(InformationDeskNames.T11, "a", "1", Terminal.this));
        informationdesk.add(new InformationDesk(InformationDeskNames.T12, "a", "2", Terminal.this));
        informationdesk.add(new InformationDesk(InformationDeskNames.T13, "a", "3", Terminal.this));
        informationdesk.add(new InformationDesk(InformationDeskNames.T21, "a", "4", Terminal.this));
        informationdesk.add(new InformationDesk(InformationDeskNames.T22, "a", "5", Terminal.this));
        informationdesk.add(new InformationDesk(InformationDeskNames.T23, "a", "6", Terminal.this));
        informationdesk.add(new InformationDesk(InformationDeskNames.T31, "a", "7", Terminal.this));
        informationdesk.add(new InformationDesk(InformationDeskNames.T32, "a", "8", Terminal.this));
        informationdesk.add(new InformationDesk(InformationDeskNames.T33, "a", "9", Terminal.this));


    }

    public TerminalNames getName() {
        return name;
    }

    public int getCheckIns() {
        return checkIns;
    }

    public ArrayList<InformationDesk> getInformationdesk() {
        return informationdesk;
    }

    /*
        public Employee[] getEmployee() {
            return employee;
        }
    */
    public void setCheckIns(int checkIns) {
        this.checkIns = checkIns;
    }
/*
    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    @Override
    public int countPassenger(Passenger passengers) {
        return 0;
    }

    @Override
    public int countBaggage(Pasenger passenger) {
        return 0;
    }
*/
    @Override
    public String version() {
        return "<"+id+"> "+"<"+type+">";
    }
}
