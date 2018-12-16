package com.infoshare.academy.model.cars;

public class CarTruck extends Car {

    protected Integer capacity;
    protected Integer cargoSpace;
    protected String lift;

    public CarTruck(Integer id, String make, String model, Integer year, Enum fuelSource, Integer power, Integer mileage, Integer capacity, Integer cargoSpace, String lift) {
        super(id, make, model, year, fuelSource, power, mileage);
        this.capacity = capacity;
        this.cargoSpace = cargoSpace;
        this.lift = lift;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCargoSpace() {
        return cargoSpace;
    }

    public void setCargoSpace(Integer cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    public String getLift() {
        return lift;
    }

    public void setLift(String lift) {
        this.lift = lift;
    }


}