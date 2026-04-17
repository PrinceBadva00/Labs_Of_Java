
class Base {

    void debug() {
        System.out.println("Debugging method from base class");
    }
}

class A extends Base {
    void show() {
        System.out.println("Class A");
    }
}

class B extends Base {
    void show() {
        System.out.println("Class B");
    }
}

public class Q05_ProjectDemo {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        a.show();
        a.debug();

        b.show();
        b.debug();
    }
}