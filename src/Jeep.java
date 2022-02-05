package Lesson06.src;

import Lesson06.src.models.Car;


public class Jeep extends Car {

    private int countDoor;
    private float maxCargo;
    private float currentCargo;

    public Jeep(String model, String color, int maxSpeed, float acceleration, int countDoor, int countFuel, float maxCargo) {
        super(model, color, maxSpeed, acceleration, countFuel);
        this.countDoor = countDoor;
        this.maxCargo = maxCargo;
        this.currentCargo = 0;
    }

    @Override
    public void voice() {
        System.out.println(model + " beeeeeeeeeeeeeeeeeeeeeeeep");
    }

    @Override
    public void goToCity(int distance) {
        countFuel -= distance / 75 * 2;
        System.out.println(model + " current fuel: " + countFuel);
    }

    public void loading(float countCargo) {
        if (currentCargo + countCargo < maxCargo) {
            currentCargo += countCargo;
            System.out.println("Cargo " + countCargo + " success");
        } else {
            System.out.println("Not enough cargo");
        }
    }

}
