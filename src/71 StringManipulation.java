import java.util.Locale;

class StringManipulation {
    public static void main(String[] args) {
    String firstName = " Swastik";
    String lasName =" Chandra";
    String fullName = firstName.concat( " ") .concat(lasName);
        System.out.println(fullName.toUpperCase());
    }
}
