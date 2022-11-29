import java.util.ArrayList;
import java.util.List;

public class MainMenu {

   protected static ArrayList<Flight> flights = new ArrayList<>();
   private static Passenger passengerOne;
   private static Passenger passengerTwo;


    public static void main(String[] args) {
       passengerOne = new Passenger("Bob", 125, 357);
       passengerTwo = new Passenger ("Lucy", 467, 259);
      //flights.add(new Flight("Singapore", 111, List.of(new Passenger("John,", 12, 13))));
      flights.add(new Flight("Singapore", 111, List.of(passengerOne, passengerTwo)));
      displayFlights();
      System.out.println(passengerOne);

    }




    public static void addFlight(Flight flight) {

      flights.add(flight);

    }

    public static String displayFlights(){
        String outPut = "";
     for(Flight flight : flights){
         outPut = outPut + flight.toString() + "\n";
      System.out.println(flight.toString());
     }
     return outPut;
    }

    public static void addPassenger(){

     // Flight array list contains flights
     //each flight contains an arrayList of passengers
     //arrayList of passengers contains individual passengers
     //we want to add individual passengers to passengers arrayList.


     //public Flight (String destination, int id, ArrayList<String> passengers){
     //        this.destination = destination;
     //        this.id = id;
     //        this.passengers = passengers;

    }

    public static void bookFlight(){

    }

    public static void cancelFlight(){

    }



}
