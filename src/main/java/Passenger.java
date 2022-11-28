public class Passenger {


    String name;
    long contactNumber;
    int id;



    public Passenger (String name, long contactNumber, int id){
        this.name = name;
        this.contactNumber = contactNumber;
        this.id = id;
    }



    //Getters + Setters
    public String getName() {
        return name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setId(int id) {
        this.id = id;
    }
}
