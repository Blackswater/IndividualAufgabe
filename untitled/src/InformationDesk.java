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

    public InformationDeskNames getName() {
        return name;
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
*/
        @Override
        public boolean informFederalPolice() {
            //callFederalPolice(name);
            System.out.println("DIe Bundespolizei wurde Informiert und zu ihrem InformationDesk geschickt! " + getName());
            return true;
        }

    @Override
    public String version() {
        return "id: <"+id+"> " + "type: <" + type +">";
    }
}
