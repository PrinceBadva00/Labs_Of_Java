package LAB_5;

class InvalidHexException extends Exception {
    public InvalidHexException(String msg) {
        super(msg);
    }
}

public class Q02_HexCheck {

    static void checkHex(String str) throws InvalidHexException {
        if (!str.matches("[0-9A-Fa-f]+")) {
            throw new InvalidHexException("Not a Hexadecimal Number");
        }
    }

    public static void main(String[] args) {
        String num = "1A3G"; // change input

        try {
            checkHex(num);
            System.out.println("Valid Hexadecimal Number");
        } catch (InvalidHexException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Ending the program");
    }
}