public class Vehicle {
    private int id;
    private String licensePlate;
    private String brand;
    private String model;
    private String vehicleType;

    public Vehicle() {
    }

    public Vehicle(int id, String licensePlate, String brand, String model, String vehicleType) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.vehicleType = vehicleType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void updateLicensePlate(String newPlate) {
        if (newPlate != null && !newPlate.isBlank()) {
            this.licensePlate = newPlate;
        }
    }

    @Override
    public String toString() {
        return String.format("Авто: %s %s [%s] | Номер: %s",
                brand, model, vehicleType, licensePlate);
    }
}