import java.util.*;

public class Q05_CapitalizeWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");
        String result = "";

        for (String w : words) {
            if (w.length() > 0) {
                String temp = Character.toUpperCase(w.charAt(0)) + w.substring(1);
                result += temp + " ";
            }
        }

        System.out.println("Output: " + result);
        sc.close();
    }
}