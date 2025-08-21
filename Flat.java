package flatAssignment;

public class Flat {

    int rent ;
    int distance ;
    int time ;
    int locationAdv ;


    public Flat(int rent, int distance, int time, int locationAdv) {
        this.rent = rent;
        this.distance = distance;
        this.time = time;
        this.locationAdv = locationAdv;
    }

    int totalSaving(){
        int workingDays = 20;
        int distaceCost = distance*2*10*workingDays;
        int travellingCost = time*2*5*workingDays;
        return rent + distaceCost + travellingCost - locationAdv;

    }
}
