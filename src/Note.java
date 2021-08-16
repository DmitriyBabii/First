public class Note {
    private final String name;
    private final String phoneNumber;


    Note(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone number: " + phoneNumber;
    }
}
