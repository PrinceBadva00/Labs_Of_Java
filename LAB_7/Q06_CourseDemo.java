

class Course {
    int id;
    String desc;
    int duration;
    double fees;

    Course(int id, String desc, int duration, double fees) {
        this.id = id;
        this.desc = desc;
        this.duration = duration;
        this.fees = fees;
    }

    void getData() {
        System.out.println(id + " " + desc + " " + duration + " " + fees);
    }
}

public class Q06_CourseDemo {
    public static void main(String[] args) {

        Course c[] = new Course[5];

        c[0] = new Course(1, "Java", 3, 5000);
        c[1] = new Course(2, "Python", 2, 4000);
        c[2] = new Course(3, "C++", 3, 4500);
        c[3] = new Course(4, "DSA", 4, 6000);
        c[4] = new Course(5, "Web", 2, 3500);

        for (int i = 0; i < 5; i++) {
            c[i].getData();
        }
    }
}