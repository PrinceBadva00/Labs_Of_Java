

class Parent {
    int x;

    Parent(int x) {
        this.x = x;
    }
}

class Child extends Parent {
    int x;

    Child(int a, int b) {
        super(a);
        this.x = b;
    }

    void show() {
        System.out.println("Parent x = " + super.x);
        System.out.println("Child x = " + this.x);
    }
}

public class Q01_SuperThisDemo {
    public static void main(String[] args) {
        Child c = new Child(10, 20);
        c.show();
    }
}