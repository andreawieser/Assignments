public class Bike extends Vehicle {
	
    private String type;
    private int noGears;
    
    public Bike(String id, String type, int noGears) {
        super(id, 2);
        setNoGears(noGears);
        setType(type);
    }
    public int getNoGears() {
        return noGears;
    }
    public void setNoGears(int noGears) {
        if (noGears >= 1) {
            this.noGears = noGears;
        }  
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        if (type!=null) {
            this.type = type;
        }
    }
    public String toString() {
		return super.toString() + " " + type + ", " + noGears + " gears";
    }
    public String getVehicleType() {
		return "bike";
    }
}
