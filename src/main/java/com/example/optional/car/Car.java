package com.example.optional.car;

public class Car {
    private Insurance insurance;

    public Car(Insurance insurance) {
        this.insurance = insurance;
    }

    public Insurance getInsurance() {
        return insurance;
    }
}
