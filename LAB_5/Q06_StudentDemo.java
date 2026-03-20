package LAB_5;

class Student {

    String inputName(String name) {
        return name;
    }

    String average(int a, int b, int c) {
        int avg = (a + b + c) / 3;

        if (avg >= 50)
            return "Pass";
        else
            return "Fail";
    }
}

public class Q06_StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println("Name: " + s.inputName("Rahul"));
        System.out.println("Result: " + s.average(60, 55, 40));
    }
}