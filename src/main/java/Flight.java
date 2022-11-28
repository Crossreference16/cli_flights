import java.util.ArrayList;

public class Flight {

    String destination;
    int id;
    ArrayList<String> passengers;


    public Flight (String destination, int id, ArrayList<String> passengers){
        this.destination = destination;
        this.id = id;
        this.passengers = passengers;
    }


    //Getters + Setters
    public String getDestination() {
        return destination;
    }

    public int getId() {
        return id;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setId(int id) {
        this.id = id;
    }
}
