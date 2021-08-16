import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Phonebook a = new Phonebook("Dima", "+380504634927");

        a.add("Vasya", "+380504634927");
        a.add("Kesha", "+380504634927");
        a.add("Kesha", "+380504634927");
        //a.output();
        System.out.println((a.get("Vasya")) + "\n");

        Note[] note = a.getAll("Kesha");
        for (Note n : note) {
            System.out.println("Name: " + n.getName());
            System.out.println("Phone number: " + n.getPhoneNumber());
        }
    }
}
