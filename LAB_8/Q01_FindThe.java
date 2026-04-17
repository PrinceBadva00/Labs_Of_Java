import java.util.*;

public class Q01_FindThe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String str = sc.nextLine();

        int first = str.indexOf("the");
        int last = str.lastIndexOf("the");

        if (first == -1 || last == -1 || first == last) {
            System.out.println("Not enough 'the' found");
        } else {
            String result = str.substring(first + 3, last);
            System.out.println("Output: " + result);
        }
        sc.close();
    }
    
}