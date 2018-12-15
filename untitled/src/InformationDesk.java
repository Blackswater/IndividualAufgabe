public class InformationDesk implements IInformationDesk {
    private InformationDeskNames name;
    private String type;
    private String id;
    private Terminal terminal;

    public InformationDesk(InformationDeskNames name, String type, String id, Terminal terminal) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.terminal= terminal;
    }

/*
    @Override
    public Passenger searchPassengerByID(Boardingpas boardingpass) {
        return null;
    }

    @Override
    public GateID searchGateByFlight(BoardingPass boardingPass) {
        return null;
    }

    @Override
    public void informFederalPolice() {
        callFederalPolice(name);
    }
*/
    @Override
    public String version() {
        return "<"+id+"> " + "<" + type +">";
    }
}
