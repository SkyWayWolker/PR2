public class ParkingSpot {
    private int id;
    private String spotNumber;
    private String spotType;
    private boolean isOccupied;
    private double hourlyRate;

    public ParkingSpot() {
    }

    public ParkingSpot(int id, String spotNumber, String spotType, boolean isOccupied, double hourlyRate) {
        this.id = id;
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        this.isOccupied = isOccupied;
        this.hourlyRate = hourlyRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(String spotNumber) {
        this.spotNumber = spotNumber;
    }

    public String getSpotType() {
        return spotType;
    }

    public void setSpotType(String spotType) {
        this.spotType = spotType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void occupySpot() {
        this.isOccupied = true;
    }

    public void vacateSpot() {
        this.isOccupied = false;
    }

    @Override
    public String toString() {
        String status = isOccupied ? "Зайнято" : "Вільне";
        return String.format("Місце №%-5s | Тип: %-10s | Тариф: %.2f грн/год | Статус: %s",
                spotNumber, spotType, hourlyRate, status);
    }
}