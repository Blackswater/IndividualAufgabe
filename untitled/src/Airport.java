import java.lang.reflect.Array;
import java.util.ArrayList;

public class Airport implements IAirport {

//    private AirportReourcePool resourcePool;
 //private ArrayList<Gate> gateList;
 //private Apron apron;
//private ArrayList<CheckInDesk> checkInDeskList;
 //private IBulkyBaggageDesk bulykBaggageDesk;
 //private ArrayList<ISecurityCheckList> securityCheckList;
 //private ApronControl apronControl;
 //private Tower tower;
    private String name;
    private String type;
    private String id;
    private ArrayList<Terminal> terminal = new ArrayList<Terminal>();


    public String getName() {
        return name;
    }

    public ArrayList<Terminal> getTerminal() {
        return terminal;
    }

    /*   public Airport(AirportReourcePool resourcePool, ArrayList<Gate> gateList
                , Apron apron, ArrayList<CheckInDesk> checkInDeskList
                , IBulkyBaggageDesk bulykBaggageDesk, ArrayList<ISecurityCheckList> securityCheckList, ApronControl apronControl, Tower tower, String type, String id) {
            this.resourcePool = resourcePool;
            this.gateList = gateList;
            this.apron = apron;
            this.checkInDeskList = checkInDeskList;
            this.bulykBaggageDesk = bulykBaggageDesk;
            this.securityCheckList = securityCheckList;
            this.apronControl = apronControl;
            this.tower = tower;
            this.type = type;
            this.id = id;
        }
     */
    public Airport(String name, String id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;
        build();
    }
/*
    public AirportReourcePool getResourcePool() {
        return resourcePool;
    }

    public ArrayList<Gate> getGateList() {
        return gateList;
    }

    public Apron getApron() {
        return apron;
    }

    public ArrayList<CheckInDesk> getCheckInDeskList() {
        return checkInDeskList;
    }

    public IBulkyBaggageDesk getBulykBaggageDesk() {
        return bulykBaggageDesk;
    }

    public ArrayList<ISecurityCheckList> getSecurityCheckList() {
        return securityCheckList;
    }

    public ApronControl getApronControl() {
        return apronControl;
    }

    public Tower getTower() {
        return tower;
    }
*/
    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    @Override
    public void build() {

        terminal.add(new Terminal(TerminalNames.T1, "a", "1", Airport.this));
        terminal.add(new Terminal(TerminalNames.T2, "a", "2", Airport.this));
        terminal.add(new Terminal(TerminalNames.T3, "a", "3", Airport.this));
    //    for(Terminal t: terminal) {
      //     System.out.println(t);
        //}
    }
/*
    }

    @Override
    public boolean connectAirplane(Airplane airplane, Gate gate) {
        return false;
    }

    @Override
    public boolean disconnectAirplane(Airplane airplane, Gate gate) {
        return false;
    }

    @Override
    public boolean executeServiceWasterWater(Gate gate) {
        return false;
    }

    @Override
    public boolean executeCheckIn() {
        return false;
    }

    @Override
    public boolean executeBulkyBaggae() {
        return false;
    }

    @Override
    public boolean executePassportControl() {
        return false;
    }

    @Override
    public boolean executeCustoms() {
        return false;
    }

    @Override
    public boolean executeAirCargo(Gate gate) {
        return false;
    }

    @Override
    public boolean executeBaggageSortingUnitSecurityCheck() {
        return false;
    }

    @Override
    public boolean executeBaggageSortingUnitContainerLeadign() {
        return false;
    }

    @Override
    public boolean executeBagageSortingUnitVehicle(Gate gate) {
        return false;
    }

    @Override
    public boolean executeServiceBase(Gate gate) {
        return false;
    }

    @Override
    public boolean executeServiceFreshWater(Gate gate) {
        return false;
    }

    @Override
    public boolean executeServiceNitrogenOxygen(Gate gate) {
        return false;
    }

    @Override
    public boolean executeSkyTanking(Airplane airplane) {
        return false;
    }

    @Override
    public boolean executeBoardingControl(Gate gate) {
        return false;
    }

    @Override
    public boolean executePushBack(Gate gate) {
        return false;
    }

    @Override
    public boolean executeGroundOperationsLogging() {
        return false;
    }
*/
    @Override
    public String version() {

        return "id: <" + id +"> " + "type: <"+type+">";
    }
}
