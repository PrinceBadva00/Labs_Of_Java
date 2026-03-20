import java.util.*;

class Q06_Point3D {
    int x, y, z;

    Q06_Point3D() {
        x = y = z = 0;
    }

    Q06_Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        sc.close();
    }

    void display() {
        System.out.println("(" + x + "," + y + "," + z + ")");
    }

    double distance(Q06_Point3D p) {
        return Math.sqrt(Math.pow(x - p.x, 2) +
                Math.pow(y - p.y, 2) +
                Math.pow(z - p.z, 2));
    }

    public static void main(String[] args) {
        Q06_Point3D p1 = new Q06_Point3D(1, 2, 3);
        Q06_Point3D p2 = new Q06_Point3D(4, 5, 6);

        p1.display();
        p2.display();

        System.out.println("Distance: " + p1.distance(p2));
    }
}