public class User {
    private int id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String role;

    public User() {
    }

    public User(int id, String fullName, String email, String phoneNumber, String role) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void updateContactData(String email, String phone) {
        this.email = email;
        this.phoneNumber = phone;
    }

    @Override
    public String toString() {
        return String.format("Користувач: %-20s | Роль: %-8s | Тел: %s | Email: %s",
                fullName, role, phoneNumber, email);
    }
}