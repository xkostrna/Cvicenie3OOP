package sk.stuba.fei.uim.oop;

public class Car {
    private final static double FULL_TANK = 50;
    private final static double FUEL_PER_KM = 0.25;

    private double amountOfFuel;

    double getAmountOfFuel() {
        return this.amountOfFuel;
    }

    void fuelMyCar() {
        this.amountOfFuel += FULL_TANK;
    }

    void driveToPlace(int distanceToPlace) {
        this.amountOfFuel = this.amountOfFuel
                - distanceToPlace * FUEL_PER_KM;
        if (this.amountOfFuel < 0.0) {
            fuelMyCar();
        }
    }

}
