import java.util.*;

public class Q03_NameSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String names[] = new String[10];

        System.out.println("Enter 10 names:");

        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        // remove first 3 characters
        for (int i = 0; i < 10; i++) {
            if (names[i].length() > 3)
                names[i] = names[i].substring(3);
        }

        // sort
        Arrays.sort(names);

        System.out.println("Sorted names:");
        for (String n : names) {
            System.out.println(n);
        }
        sc.close();
    }
}