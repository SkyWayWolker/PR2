import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParkingTicket {
    private int id;
    private int spotId;
    private int vehicleId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double totalAmount;
    private boolean isPaid;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public ParkingTicket() {
    }

    public ParkingTicket(int id, int spotId, int vehicleId, LocalDateTime startTime, LocalDateTime endTime, double totalAmount, boolean isPaid) {
        this.id = id;
        this.spotId = spotId;
        this.vehicleId = vehicleId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalAmount = totalAmount;
        this.isPaid = isPaid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void closeTicket(LocalDateTime endTime, double hourlyRate) {
        this.endTime = endTime;
        long hours = java.time.Duration.between(startTime, endTime).toHours();
        if (hours == 0) hours = 1;
        this.totalAmount = hours * hourlyRate;
    }

    @Override
    public String toString() {
        String startStr = startTime != null ? startTime.format(FORMATTER) : "—";
        String endStr = endTime != null ? endTime.format(FORMATTER) : "В процесі";
        String paymentStatus = isPaid ? "Оплачено" : "Очікує оплати";

        return String.format("Квиток №%d | Заїзд: %s | Виїзд: %s | Сума: %.2f грн | Статус: %s",
                id, startStr, endStr, totalAmount, paymentStatus);
    }
}