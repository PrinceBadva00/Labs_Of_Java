class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    Employee(String f, String l, double s) {
        firstName = f;
        lastName = l;
        if (s > 0)
            monthlySalary = s;
    }

    double yearlySalary() {
        return monthlySalary * 12;
    }

    void giveHike() {
        monthlySalary = monthlySalary + (monthlySalary * 0.10);
    }
}

public class Q3_EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee("Raj", "Shah", 30000);
        Employee e2 = new Employee("Amit", "Patel", 40000);

        System.out.println(e1.yearlySalary());
        System.out.println(e2.yearlySalary());

        e1.giveHike();
        e2.giveHike();

        System.out.println(e1.yearlySalary());
        System.out.println(e2.yearlySalary());
    }
}
