package hw9.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Stan", "1234567");
        phoneDirectory.add("Nick", "12341123");
        phoneDirectory.add("Arnold", "12312451");
        phoneDirectory.add("Stan", "12352113");
        System.out.println(phoneDirectory.find("Nick"));
    }
    
}
