
class Teacher {
    String name;
    int id;

    Teacher(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showTeacher() {
        System.out.println(name + " " + id);
    }
}

class Student extends Teacher {
    int marks;

    Student(String name, int id, int marks) {
        super(name, id);
        this.marks = marks;
    }

    void showStudent() {
        System.out.println(name + " " + id + " " + marks);
    }
}

public class Q04_InheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 101, 85);

        s.showTeacher();
        s.showStudent();
    }
}