public class Car extends Vehicle {
	
    private String manufacturer;
    private String model;
    
    //constructors
    public Car() {
        this("no_id", "no_name", "no_model");
    }
    public Car(String id, String manufacturer, String model) {
        super(id, 4);
        setManufacturer(manufacturer);
        setModel(model);
    }
    //get/set methods
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        if (manufacturer!=null) {
            this.manufacturer = manufacturer;
        }
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (model!=null) {
            this.model = model;
        }
    }
    //toString
    public String toString() {
        return super.toString() + ": " + manufacturer + "/" + model;
    }
    public String getVehicleType() {
        return "car";
    }
}
