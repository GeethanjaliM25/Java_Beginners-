public class Regex {
    public static void main(String[] args) {
        String name = "Geethanjali";
        String mobile = "9876543210";

        String nameRegex = "[A-Z][a-z]+";
        String mobileRegex = "[6-9][0-9]{9}";

        System.out.println(name.matches(nameRegex));
        System.out.println(mobile.matches(mobileRegex));
    }
}
