
public class Contact {
    private String name;
    private Integer phone_number;
    private String email;
    private String address;
// need to include tags as well
    public Contact(String name, Integer phone_number, String email, String address) {
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public Integer phone_number() {
        return phone_number;
    }

    public String email() {
        return email;
    }

    public String address() {
        return address;
    }
    @Override
    public String toString() {
        return "Contact:  " + name +
            "\nphone_number: " + phone_number +
            "\n email: " + email +
            "\n address: " + address +
            "\n";
}
}


