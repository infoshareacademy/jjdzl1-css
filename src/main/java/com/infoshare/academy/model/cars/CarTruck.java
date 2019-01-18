package com.infoshare.academy.model.cars;

public class CarTruck extends Car {

    protected Integer capacity;
    protected Integer cargoSpace;
    protected Boolean hasLift;


    //Constructor
    public CarTruck(Integer id, String make, String model, Integer year, Integer mileage, FuelSourceEnum fuelSourceEnum, Integer enginePower, Integer capacity, Integer cargoSpace, Boolean hasLift) {
        super(id, make, model, year, mileage, fuelSourceEnum, enginePower);
        this.capacity = capacity;
        this.cargoSpace = cargoSpace;
        this.hasLift = hasLift;
    }

    //Getters
    public Integer getCapacity() {
        return capacity;
    }

    public Integer getCargoSpace() {
        return cargoSpace;
    }

    public Boolean getHasLift() {
        return hasLift;
    }

    //Setters
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setCargoSpace(Integer cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    public void setHasLift(Boolean hasLift) {
        this.hasLift = hasLift;
    }

    //Methods
    @Override
    public String toString() {
        return "CarTruck{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", fuelSourceEnum=" + fuelSourceEnum +
                ", enginePower=" + enginePower +
                ", capacity=" + capacity +
                ", cargoSpace=" + cargoSpace +
                ", haveLift='" + hasLift + '\'' +
                "} ";
    }
}
