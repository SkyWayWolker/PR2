import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ParkingSpot spot = new ParkingSpot(1, "A-12", "Standard", true, 40.0);
        Vehicle vehicle = new Vehicle(101, "BH1234AB", "Toyota", "RAV4", "Кросовер");
        User user = new User(501, "Олексій Іванов", "alex@example.com", "+380671234567", "Водій");

        LocalDateTime start = LocalDateTime.of(2026, 10, 1, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 10, 1, 12, 30);
        ParkingTicket ticket = new ParkingTicket(1001, spot.getId(), vehicle.getId(), start, end, 100.0, true);

        System.out.println("=========================================================");
        System.out.println("               СИСТЕМА ОБЛІКУ ПАРКУВАННЯ                 ");
        System.out.println("=========================================================\n");

        System.out.println("[ Паркувальне місце ]");
        System.out.println(spot);
        System.out.println();

        System.out.println("[ Транспортний засіб ]");
        System.out.println(vehicle);
        System.out.println();

        System.out.println("[ Користувач ]");
        System.out.println(user);
        System.out.println();

        System.out.println("[ Паркувальна сесія ]");
        System.out.println(ticket);
        System.out.println();

        System.out.println("=========================================================");
    }
}