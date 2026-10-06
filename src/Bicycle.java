public class Bicycle {
    private int gear = 1;
    private int cadence = 0;
    private int speed = 0;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Gear: " + gear + " Speed: " + speed + " Cadence: " + cadence);
    }
}