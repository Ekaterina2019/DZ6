package Lesson06.src;

import Lesson06.src.models.Car;



public class Mazda extends Car {

//    private String model;

    public Mazda(String model, String color, int maxSpeed, float acceleration, int countFuel) {
        super(model, color, maxSpeed, acceleration, countFuel);
    }

    @Override
    public void voice() {
        System.out.println(model + " beep-beep-beep");
    }

    @Override
    public void goToCity(int distance) {
        countFuel -= distance / 50 * 2;
        System.out.println(model + " current fuel: " + countFuel);
    }


}
