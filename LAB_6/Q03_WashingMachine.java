class Q03_WashingMachine {

    void switchOn() {
        System.out.println("Machine ON");
    }

    int acceptClothes(int n) {
        return n;
    }

    void acceptDetergent() {
        System.out.println("Detergent Added");
    }

    void switchOff() {
        System.out.println("Machine OFF");
    }

    public static void main(String[] args) {
        Q03_WashingMachine w = new Q03_WashingMachine();

        w.switchOn();
        System.out.println("Clothes: " + w.acceptClothes(5));
        w.acceptDetergent();
        w.switchOff();
    }
}