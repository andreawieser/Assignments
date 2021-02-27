public class Vehicle {
	
    //static variable
    private static int vehicleCount = 0;
    //instance variables
    private int noTires;
    private String id;
    //constructors
    public Vehicle() {
        this("", 1);
    }
    public Vehicle(String id, int noTires) {
        setId(id);
        setNoTires(noTires);
        vehicleCount++;
    }
    //get/set methods
    public int getNoTires() {
        return noTires;
    }
    public void setNoTires(int noTires) {
        if (noTires > 0) { 
            this.noTires = noTires;
        }
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        if (id!=null) {
            this.id = id;
        }
    }
    //toString
    public String toString() {
        return getVehicleType() + " '" + id + "'";
    }
    public String getVehicleType() {
        return "vehicle";
    }
    //static method
    public static int getVehicleCount() {
        return vehicleCount;
    }
}
