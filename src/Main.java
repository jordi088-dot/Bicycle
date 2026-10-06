public class Main {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        Bicycle b2 = new Bicycle();

        TandemBike tb = new TandemBike();

        b = tb;

        TandemBike td2;

        td2 = (TandemBike) b2;

        td2.printStates();
    }
}
