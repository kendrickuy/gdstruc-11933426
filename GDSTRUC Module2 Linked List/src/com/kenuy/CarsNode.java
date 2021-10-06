package com.kenuy;

public class CarsNode {
    private Cars cars;
    private CarsNode nextCars;

    public CarsNode(Cars cars) {
        this.cars = cars;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public CarsNode getNextCars() {
        return nextCars;
    }

    public void setNextCars(CarsNode nextCars) {
        this.nextCars = nextCars;
    }
}
